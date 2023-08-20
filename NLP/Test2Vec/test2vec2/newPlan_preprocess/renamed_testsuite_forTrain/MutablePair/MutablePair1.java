
package MutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutablePair1 {

    public static boolean debug = false;

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0501");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = null;
        objMutablePair0.left = obj8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0502");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0503");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequenceMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.CharSequence) "(10.0,hi!)", objPair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0504");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = null;
        objMutablePair0.right = charSequence8;
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
            System.out.format("%n%s%n", "MutablePair1.test0505");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair2.right;
        java.lang.String str5 = objMutablePair2.toString();
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        boolean boolean8 = objMutablePair0.equals((java.lang.Object) objMutablePair2);
        java.lang.CharSequence charSequence9 = objMutablePair2.right;
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
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!)" + "'", charSequence9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0506");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.getKey();
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
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0507");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0508");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) -1 + "'", obj6.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0509");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0510");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objPairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0511");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objEntryMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
        objMutablePair0.setLeft((java.lang.Object) objEntryMutablePair6);
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String> serializableMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, "(4,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0512");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "";
        objMutablePair0.setRight((java.lang.CharSequence) "(10,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0513");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getLeft();
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
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0514");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(null,(null,))", (java.lang.CharSequence) "(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0515");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0516");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        java.lang.String str5 = objMutablePair2.toString("(-1,(null,(-1,null)))");
        java.lang.String str6 = objMutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,(null,(-1,null)))" + "'", str5.equals("(-1,(null,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(a,(-1,null))" + "'", str6.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0517");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "((null,null),null)");
        java.lang.CharSequence charSequence9 = objMutablePair8.getValue();
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
            System.out.format("%n%s%n", "MutablePair1.test0518");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = objMutablePairMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0519");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(4,null)" + "'", str5.equals("(4,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0520");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.String str8 = objMutablePair0.toString();
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0521");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = null;
        objMutablePair2.setRight(charSequence4);
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair2.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair2.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0522");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "";
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0523");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        objMutablePair1.left = (byte) 0;
        java.lang.Object obj7 = objMutablePair1.left;
        java.lang.Object obj8 = objMutablePair1.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 0 + "'", obj7.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 0 + "'", obj8.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0524");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(-1,null))");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0525");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) 1.0f, (java.io.Serializable) objMutablePair1);
        java.lang.Class<?> wildcardClass6 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass6, "(null,(null,(-1,(-1,null))))");
        java.lang.Class<?> wildcardClass9 = annotatedElementMutablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0526");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str7 = objMutablePair0.toString("");
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(-1,null))" + "'", str8.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0527");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence4 = objMutablePair3.right;
        java.lang.CharSequence charSequence5 = objMutablePair3.getRight();
        objMutablePair3.setRight((java.lang.CharSequence) "((null,null),null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> typeMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of(type0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0528");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass2, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.Comparable<java.lang.String>> objPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) wildcardClass2, (java.lang.Comparable<java.lang.String>) "(null,(null,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0529");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.Object obj4 = objMutablePair2.getLeft();
        objMutablePair2.right = "(a,(-1,null))";
        objMutablePair2.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0530");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement2 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, annotatedElement2);
        java.lang.Class<?> wildcardClass4 = objPairMutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0531");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(10.0,hi!)");
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(10.0,hi!)" + "'", charSequence5.equals("(10.0,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0532");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0533");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.String str5 = objMutablePair0.toString("(-1,null)");
        java.lang.String str7 = objMutablePair0.toString("(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,null)" + "'", str5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0534");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.reflect.Type type6 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.Type> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.Type>((java.lang.Object) objMutablePair0, type6);
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10.0d + "'", obj8.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0535");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString("(-1,(null,(-1,null)))");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,(null,(-1,null)))" + "'", str9.equals("(-1,(null,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0536");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0537");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0538");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence7 = objMutablePair6.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair6.setValue((java.lang.CharSequence) "(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0539");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
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
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0540");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence7 = objMutablePair6.getValue();
        java.lang.Object obj8 = objMutablePair6.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0541");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.CharSequence> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, (java.lang.CharSequence) "");
        java.lang.String str9 = objMutablePair0.toString("(4,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(4,(null,null))" + "'", str9.equals("(4,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0542");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        java.lang.String str8 = objMutablePair0.toString();
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
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", str8.equals("(null,(null,(-1,(-1,null))))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0543");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString("(null,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4' + "'", obj5.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0544");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(-1,(null,null))");
        int int8 = objMutablePair0.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0545");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.String str7 = objMutablePair0.toString();
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0546");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.String str6 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0547");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,(-1,null))";
        java.lang.Object obj8 = objMutablePair0.getKey();
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
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0548");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0549");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0550");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.Object obj5 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0551");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0552");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0553");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(-1,null))");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,(-1,null))" + "'", charSequence8.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,(-1,null))" + "'", charSequence9.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0554");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("hi!");
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.left;
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
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0555");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        java.lang.Object obj4 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0556");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        objMutablePair2.setRight((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.Object obj6 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0557");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.String str8 = objMutablePair0.toString("(null,(-1,(-1,null)))");
        java.lang.String str9 = objMutablePair0.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(-1,(-1,null)))" + "'", str8.equals("(null,(-1,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0558");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair4.getLeft();
        java.lang.Object obj8 = objMutablePair4.getLeft();
        java.lang.Object obj9 = objMutablePair4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
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
            System.out.format("%n%s%n", "MutablePair1.test0559");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("((null,null),null)");
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((null,null),null)" + "'", str3.equals("((null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0560");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of(serializable0, (java.lang.Comparable<java.lang.String>) "(null,)");
        java.lang.Class<?> wildcardClass3 = serializableMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "(null,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0561");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Class<?>> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0562");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Object> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of(serializable0, (java.lang.Object) charSequence4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence4, (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj8 = objMutablePair7.left;
        java.lang.Class<?> wildcardClass9 = objMutablePair7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0563");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of(serializable1, (java.lang.Comparable<java.lang.String>) "(null,)");
        java.lang.Class<?> wildcardClass4 = serializableMutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparablePair5 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,hi!)", wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0564");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0565");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj7 = objMutablePair6.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair6.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null)" + "'", charSequence8.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0566");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,hi!)" + "'", str8.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0567");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.String str5 = objMutablePair0.toString("(-1,null)");
        objMutablePair0.setRight((java.lang.CharSequence) "(10.0,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> wildcardClassMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
        boolean boolean9 = objMutablePair0.equals((java.lang.Object) wildcardClassMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,null)" + "'", str5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0568");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(-1,null)" + "'", str6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0569");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(-1,hi!))" + "'", charSequence8.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0570");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString("(null,(null,null))");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,null))" + "'", str9.equals("(null,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0571");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.Type> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0572");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "((null,null),null)");
        java.lang.Object obj9 = objMutablePair8.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,(-1,null))");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0573");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair3.left = 10.0d;
        java.lang.Object obj6 = objMutablePair3.getLeft();
        objMutablePair0.left = obj6;
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0574");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
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
            System.out.format("%n%s%n", "MutablePair1.test0575");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,null)" + "'", str8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0576");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,hi!)");
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
            System.out.format("%n%s%n", "MutablePair1.test0577");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(4,null)", objPair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0578");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0579");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.right = "(null,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0580");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj3, charSequence5);
        java.lang.String str7 = objMutablePair6.toString();
        java.lang.String str9 = objMutablePair6.toString("(4,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(4,(null,null))" + "'", str9.equals("(4,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0581");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.Class<?> wildcardClass4 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparablePair5 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,(-1,null))", (java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = strComparablePair5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0582");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,null)" + "'", str8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0583");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.reflect.Type> typeMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.reflect.Type>();
        java.lang.Class<?> wildcardClass3 = typeMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Class<?>> charSequenceMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.CharSequence) "(10,(null,null))", wildcardClass3);
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass3, obj5);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,(-1,null))", (java.lang.reflect.AnnotatedElement) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0584");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.Object obj5 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "((null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0d + "'", obj4.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0585");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0586");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString("hi!");
        java.lang.String str8 = objMutablePair0.toString("(null,(null,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,hi!))" + "'", str8.equals("(null,(null,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0587");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "";
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>>();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) objMutablePair6);
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0588");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair1.test0589");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0590");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.String str6 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0d + "'", obj4.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(10.0,null)" + "'", str6.equals("(10.0,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0591");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) annotatedElementMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        java.lang.String str6 = objMutablePair3.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0592");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "(10.0,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0593");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0594");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of("(null,(null,null))", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0595");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0596");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj7 = objMutablePair6.getLeft();
        java.lang.String str8 = objMutablePair6.toString();
        java.lang.Object obj9 = objMutablePair6.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,null))" + "'", str8.equals("(null,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0597");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "hi!";
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair7.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,hi!)" + "'", charSequence8.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0598");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.Class<?> wildcardClass6 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair1, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence9 = objMutablePair8.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0599");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.String str6 = objMutablePair0.toString("(-1,hi!)");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(-1,hi!)" + "'", str6.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0600");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass5, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objEntryMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0601");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0602");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.left;
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0603");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.String str7 = objMutablePair0.toString();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
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
            System.out.format("%n%s%n", "MutablePair1.test0604");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.String str4 = objMutablePair2.toString();
        objMutablePair2.right = "hi!";
        java.lang.Class<?> wildcardClass7 = objMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(a,(-1,null))" + "'", str4.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0605");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue(charSequence3);
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0606");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.getLeft();
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
            System.out.format("%n%s%n", "MutablePair1.test0607");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = "(4,(null,null))";
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0608");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "((null,null),null)");
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(-1,null))" + "'", str9.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0609");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(-1,(null,null))");
        java.lang.CharSequence charSequence4 = objMutablePair2.setValue((java.lang.CharSequence) "(10.0,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,(null,null))" + "'", charSequence4.equals("(-1,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0610");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass5, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objEntryMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.String str9 = objMutablePair0.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0611");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.String str8 = objMutablePair0.toString("hi!");
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0612");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.Object obj4 = objMutablePair2.left;
        java.lang.CharSequence charSequence6 = objMutablePair2.setValue((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0613");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0614");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        boolean boolean9 = objMutablePair0.equals((java.lang.Object) "(10,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0615");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0616");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,hi!)" + "'", charSequence8.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0617");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(4,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0618");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,(-1,null))";
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,(-1,null))" + "'", charSequence9.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0619");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0620");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0621");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass2, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.reflect.Type> strMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of("(null,hi!)", (java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0622");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0623");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.Object obj7 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0624");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.CharSequence charSequence6 = objMutablePair1.getRight();
        objMutablePair1.left = "";
        java.lang.CharSequence charSequence9 = objMutablePair1.getRight();
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
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0625");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj4 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,)");
        java.lang.Object obj7 = objMutablePair6.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair6.getRight();
        java.lang.CharSequence charSequence9 = objMutablePair6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,)" + "'", charSequence8.equals("(null,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,)" + "'", charSequence9.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0626");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(-1,null))");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,(-1,null))" + "'", charSequence8.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0627");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0628");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.left;
        objMutablePair0.right = "(10.0,hi!)";
        objMutablePair0.setRight((java.lang.CharSequence) "(null,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String> serializableMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String>((java.io.Serializable) objMutablePair0, "hi!");
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
            System.out.format("%n%s%n", "MutablePair1.test0629");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
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
            System.out.format("%n%s%n", "MutablePair1.test0630");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        objMutablePair0.right = "((null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0631");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str5 = objMutablePair0.toString("(,null)");
        java.lang.CharSequence charSequence6 = null;
        objMutablePair0.setRight(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,null)" + "'", str5.equals("(,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0632");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "(null,(null,(-1,(-1,null))))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0633");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.String str6 = objMutablePair0.toString("(,null)");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,null)" + "'", str6.equals("(,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0634");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10.0,hi!)" + "'", str7.equals("(10.0,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10.0d + "'", obj8.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0635");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.Object obj5 = objMutablePair2.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair2, (java.lang.CharSequence) "(-1,(-1,(null,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0636");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Object> objMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Object) charSequence7, (java.lang.Object) 10);
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
        org.junit.Assert.assertNotNull(objMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0637");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) (byte) 0);
        objMutablePair0.setRight((java.lang.CharSequence) "((null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0638");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.String str5 = objMutablePair0.toString("(null,hi!)");
        java.lang.String str7 = objMutablePair0.toString("(null,hi!)");
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,hi!)" + "'", str5.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(10,null)" + "'", str8.equals("(10,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0639");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) annotatedElementMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        java.lang.CharSequence charSequence5 = objMutablePair3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0640");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!)" + "'", str8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!)" + "'", str9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0641");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objEntryMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
        objMutablePair0.setLeft((java.lang.Object) objEntryMutablePair6);
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0642");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.right = "((null,null),null)";
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
            System.out.format("%n%s%n", "MutablePair1.test0643");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0644");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.CharSequence charSequence5 = objMutablePair1.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair1.right;
        java.lang.Object obj7 = null;
        objMutablePair1.setLeft(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0645");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0646");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0647");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0648");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0649");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0650");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0651");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) -1 + "'", obj6.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0652");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(-1,(null,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0653");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (byte) 100, (java.lang.CharSequence) "(4,null)");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.CharSequence charSequence5 = objMutablePair2.right;
        java.lang.String str7 = objMutablePair2.toString("(4,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,(-1,hi!))" + "'", charSequence5.equals("(null,(-1,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(4,null)" + "'", str7.equals("(4,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0654");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.Object obj4 = objMutablePair2.left;
        java.lang.CharSequence charSequence6 = objMutablePair2.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.CharSequence charSequence7 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,(-1,null))" + "'", charSequence7.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(-1,null))" + "'", charSequence8.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0655");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(null,(-1,null)))" + "'", str8.equals("(-1,(null,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0656");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair4.left = 10.0d;
        java.lang.Object obj7 = objMutablePair4.getLeft();
        objMutablePair1.left = obj7;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> charSequenceMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>((java.lang.CharSequence) "(-1,(null,(-1,null)))", (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0657");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        objMutablePair0.right = "(null,hi!)";
        objMutablePair0.right = "(-1,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0658");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = objMutablePair0.compareTo(objPair7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
            System.out.format("%n%s%n", "MutablePair1.test0659");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString("(4,(-1,(-1,null)))");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(4,(-1,(-1,null)))" + "'", str9.equals("(4,(-1,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0660");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,(-1,null))" + "'", charSequence6.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0661");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = objMutablePair0.compareTo(objPair7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0662");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.getKey();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0663");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,hi!))");
        objMutablePair0.right = "";
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0664");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) annotatedElementMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        objMutablePair3.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.Object obj7 = objMutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0665");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence4 = objMutablePair3.right;
        java.lang.CharSequence charSequence5 = objMutablePair3.getValue();
        java.lang.Class<?> wildcardClass6 = charSequence5.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "((null,null),null)", (java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0666");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>((java.lang.CharSequence) "", "(-1,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.CharSequence charSequence5 = objMutablePair3.getRight();
        java.lang.Class<?> wildcardClass6 = objMutablePair3.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) "", (java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.lang.String> wildcardClassPair9 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass6, "(4,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0667");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("((null,null),null)");
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.String str6 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((null,null),null)" + "'", str3.equals("((null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null)" + "'", str6.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0668");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.Object obj7 = objMutablePair3.getKey();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0669");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0670");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair1.right;
        objMutablePair1.setRight((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> genericDeclarationMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of(genericDeclaration0, objMutablePair1);
        java.lang.Class<?> wildcardClass9 = genericDeclarationMutablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0671");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
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

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0672");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0673");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.Object obj4 = objMutablePair2.getKey();
        java.lang.Object obj5 = objMutablePair2.left;
        objMutablePair2.setRight((java.lang.CharSequence) "(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0674");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "((null,null),null)", "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0675");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence9 = objMutablePair8.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0676");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.String str8 = objMutablePair0.toString("(null,(null,(-1,(-1,null))))");
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", str8.equals("(null,(null,(-1,(-1,null))))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0677");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence6 = null;
        objMutablePair0.setRight(charSequence6);
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0678");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "(null,null)", (java.lang.CharSequence) "(,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0679");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence5, (java.lang.CharSequence) "(a,(-1,null))");
        java.lang.CharSequence charSequence8 = objMutablePair7.getValue();
        java.lang.Object obj9 = objMutablePair7.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(a,(-1,null))" + "'", charSequence8.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0680");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.left;
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0681");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Object>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) annotatedElementMutablePair0, (java.lang.CharSequence) "(null,)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0682");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getLeft();
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
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0683");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str8 = objMutablePair0.toString("(-1,null)");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,null)" + "'", str8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0684");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0685");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0686");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.String str5 = objMutablePair2.toString("(null,null)");
        java.lang.Object obj6 = objMutablePair2.getKey();
        java.lang.Object obj7 = objMutablePair2.getLeft();
        java.lang.String str8 = objMutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(10,(null,null))" + "'", str8.equals("(10,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0687");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.Object obj4 = objMutablePair2.getKey();
        java.lang.Object obj5 = objMutablePair2.left;
        java.lang.CharSequence charSequence6 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0688");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.Object obj7 = objMutablePair3.left;
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0689");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4' + "'", obj7.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0690");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.setRight((java.lang.CharSequence) "(,null)");
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
            System.out.format("%n%s%n", "MutablePair1.test0691");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.reflect.Type type8 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.Type> serializableMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0692");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
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
            System.out.format("%n%s%n", "MutablePair1.test0693");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0694");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Object> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of(serializable0, (java.lang.Object) charSequence4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence4, (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj8 = objMutablePair7.left;
        java.lang.Object obj9 = objMutablePair7.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0695");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0696");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0697");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Object> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of(serializable0, (java.lang.Object) charSequence4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence4, (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj8 = objMutablePair7.left;
        java.lang.CharSequence charSequence9 = objMutablePair7.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0698");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0699");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0700");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("hi!");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "hi!", (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence7 = objMutablePair6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0701");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair2.right = "hi!";
        java.lang.CharSequence charSequence5 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0702");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.String str4 = objMutablePair1.toString("((null,null),null)");
        java.lang.Object obj5 = objMutablePair1.getLeft();
        objMutablePair0.setLeft((java.lang.Object) objMutablePair1);
        objMutablePair1.setRight((java.lang.CharSequence) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((null,null),null)" + "'", str4.equals("((null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0703");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0704");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0705");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
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
            System.out.format("%n%s%n", "MutablePair1.test0706");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,null)");
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0707");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence7 = objMutablePair6.getValue();
        java.lang.Object obj8 = objMutablePair6.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair6.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0708");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0709");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) (byte) 0);
        objMutablePair0.right = "(null,(-1,hi!))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0710");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>("(null,(-1,null))", objPair1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0711");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        objMutablePair3.right = "(10,(null,null))";
        java.lang.String str7 = objMutablePair3.toString("(10,(null,null))");
        java.lang.CharSequence charSequence8 = objMutablePair3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10,(null,null))" + "'", str7.equals("(10,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(10,(null,null))" + "'", charSequence8.equals("(10,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0712");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
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
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0713");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0714");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "";
        java.lang.Object obj6 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0715");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.Object obj6 = objMutablePair0.getKey();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0716");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,null)");
        java.lang.Object obj4 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,hi!))" + "'", str8.equals("(null,(null,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0717");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = strMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        java.lang.Class<?> wildcardClass6 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass1, (java.lang.Object) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0718");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(10.0,null)" + "'", str8.equals("(10.0,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0719");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "hi!";
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.String str8 = objMutablePair0.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0720");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0721");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.left;
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
            System.out.format("%n%s%n", "MutablePair1.test0722");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,(-1,null))";
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,(-1,null))" + "'", charSequence9.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0723");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10.0,hi!)" + "'", str7.equals("(10.0,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10.0d + "'", obj8.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0724");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence4 = objMutablePair2.setValue((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        java.lang.Object obj5 = objMutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0725");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        java.lang.String str5 = objMutablePair0.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0726");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.CharSequence> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0727");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement2 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, annotatedElement2);
        java.lang.Object obj4 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0728");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0729");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(-1,null))");
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(4,(-1,(-1,null)))" + "'", str8.equals("(4,(-1,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0730");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair2.right;
        java.lang.String str5 = objMutablePair2.toString();
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        boolean boolean8 = objMutablePair0.equals((java.lang.Object) objMutablePair2);
        java.lang.Object obj9 = objMutablePair0.getLeft();
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
            System.out.format("%n%s%n", "MutablePair1.test0731");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0732");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence4 = objMutablePair3.getRight();
        java.lang.Object obj5 = objMutablePair3.getKey();
        java.lang.Object obj6 = objMutablePair3.left;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(-1,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0733");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence7 = objMutablePair6.getValue();
        java.lang.Object obj8 = objMutablePair6.getLeft();
        java.lang.Object obj9 = objMutablePair6.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0734");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString("");
        java.lang.Object obj5 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0735");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair2.right;
        java.lang.String str5 = objMutablePair2.toString();
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        boolean boolean8 = objMutablePair0.equals((java.lang.Object) objMutablePair2);
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0736");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> objEntryMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
        objMutablePair0.left = objEntryMutablePair7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0737");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getKey();
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0738");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getKey();
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
            System.out.format("%n%s%n", "MutablePair1.test0739");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj3, charSequence5);
        java.lang.Object obj7 = objMutablePair6.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0740");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0741");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Class<?>> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0742");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,)" + "'", charSequence5.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0743");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Object obj7 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "((null,null),null)");
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0744");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass3 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,null)", (java.lang.reflect.Type) wildcardClass3);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass3, "(-1,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.reflect.AnnotatedElement> strMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.reflect.AnnotatedElement>("(null,(-1,hi!))", (java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.io.Serializable serializable8 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.io.Serializable> wildcardClassMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass3, serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0745");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair2.right = "hi!";
        java.lang.CharSequence charSequence6 = objMutablePair2.setValue((java.lang.CharSequence) "(a,(-1,null))");
        java.lang.CharSequence charSequence7 = objMutablePair2.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(a,(-1,null))" + "'", charSequence7.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(a,(-1,null))" + "'", charSequence8.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0746");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.CharSequence charSequence6 = objMutablePair1.getRight();
        objMutablePair1.right = "(-1,(null,(-1,null)))";
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
            System.out.format("%n%s%n", "MutablePair1.test0747");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,null)", (java.lang.reflect.Type) wildcardClass2);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass2, "(-1,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) wildcardClass2, (java.lang.CharSequence) "(4,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationPair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass2, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0748");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,(-1,hi!))" + "'", str3.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0749");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
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
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0750");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair1.test0751");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((java.lang.CharSequence) "(null,)", (java.lang.reflect.AnnotatedElement) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0752");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.String str5 = objMutablePair2.toString("(null,null)");
        java.lang.Object obj6 = objMutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0753");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "(null,hi!)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = null;
        objMutablePair0.setRight(charSequence7);
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
            System.out.format("%n%s%n", "MutablePair1.test0754");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.String str7 = objMutablePair0.toString("(null,(-1,hi!))");
        java.lang.Object obj8 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,hi!))" + "'", str7.equals("(null,(-1,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0.0d + "'", obj8.equals(0.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0755");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        objMutablePair0.right = "(null,(null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0756");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,null)");
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0757");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0758");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "(4,(null,null))");
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(null,null))");
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
            System.out.format("%n%s%n", "MutablePair1.test0759");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.String str6 = objMutablePair0.toString("(,null)");
        java.lang.String str8 = objMutablePair0.toString("(-1,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,null)" + "'", str6.equals("(,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(-1,null))" + "'", str8.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0760");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,hi!)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!)" + "'", charSequence7.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0761");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.String str4 = objMutablePair1.toString("hi!");
        objMutablePair1.right = "(-1,null)";
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparablePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,(null,(-1,null)))", (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0762");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair6 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) objMutablePair0, charSequence5);
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0763");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("hi!");
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0764");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair1.test0765");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(4,(-1,(-1,null)))", (java.lang.Comparable<java.lang.String>) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0766");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass5, "(4,(null,null))");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.String> typeMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.String>((java.lang.reflect.Type) wildcardClass5, "(-1,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementPair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0767");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutablePair3.getLeft();
        objMutablePair3.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0768");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.String str2 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null)" + "'", str2.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0769");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.Object obj5 = objMutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0770");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(10.0,null)" + "'", str4.equals("(10.0,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0771");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.Object obj4 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objMutablePairMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of(objMutablePair0, (java.lang.Comparable<java.lang.String>) "(null,null)");
        java.lang.Object obj7 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePairMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0772");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(4,(null,null))", (java.lang.Comparable<java.lang.String>) "(null,)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "(null,)", (java.lang.CharSequence) "(null,(null,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0773");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.Object obj5 = objMutablePair2.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair2.right;
        java.lang.String str7 = objMutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(a,(-1,null))" + "'", str7.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0774");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.String str5 = objMutablePair2.toString();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair6 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) 1.0f, (java.io.Serializable) objMutablePair2);
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) "(10.0,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair2);
        java.lang.Object obj8 = objMutablePair2.getLeft();
        java.lang.Object obj9 = objMutablePair2.getKey();
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
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0775");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4' + "'", obj7.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0776");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getKey();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0777");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(a,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.left;
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
            System.out.format("%n%s%n", "MutablePair1.test0778");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "(null,hi!)";
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0779");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) annotatedElementMutablePair0, (java.lang.CharSequence) "(a,(-1,null))");
        java.lang.String str4 = objMutablePair2.toString("(null,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,(null,null))" + "'", str4.equals("(null,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0780");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = charSequenceMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass1, (java.lang.CharSequence) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementMutablePair3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0781");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0782");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0783");
        java.lang.reflect.AnnotatedElement annotatedElement1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair3.left = 10.0d;
        java.lang.Class<?> wildcardClass6 = objMutablePair3.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((java.lang.CharSequence) "(null,(-1,hi!))", (java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElement1, (java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((java.lang.CharSequence) "(-1,(-1,null))", annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0784");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0785");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(null,(-1,null)))" + "'", str8.equals("(-1,(null,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(-1,null))" + "'", charSequence9.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0786");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.String str5 = objMutablePair0.toString("(-1,null)");
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(10.0,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,null)" + "'", str5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0787");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("hi!");
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getKey();
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
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0788");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str7 = objMutablePair0.toString("(-1,hi!)");
        java.lang.Object obj8 = objMutablePair0.left;
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
            System.out.format("%n%s%n", "MutablePair1.test0789");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(-1,hi!))" + "'", charSequence8.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0790");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0791");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj5 = objMutablePair2.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair2.right;
        java.lang.Object obj7 = objMutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,hi!)" + "'", charSequence6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0792");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence6, (java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence9 = objMutablePair8.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,hi!)" + "'", charSequence9.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0793");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.String str6 = objMutablePair0.toString("(,null)");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,null)" + "'", str6.equals("(,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0794");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.String str4 = objMutablePair2.toString();
        objMutablePair2.right = "hi!";
        java.lang.CharSequence charSequence7 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(a,(-1,null))" + "'", str4.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0795");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        objMutablePair0.right = "(10.0,hi!)";
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,(-1,hi!))");
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
            System.out.format("%n%s%n", "MutablePair1.test0796");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        objMutablePair2.right = "(-1,(null,(-1,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0797");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.io.Serializable>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) annotatedElementMutablePair0, (java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,hi!)" + "'", charSequence3.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0798");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "";
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>>();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) objMutablePair6);
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0799");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.Object obj4 = objMutablePair2.left;
        java.lang.CharSequence charSequence6 = objMutablePair2.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.CharSequence charSequence7 = objMutablePair2.getRight();
        java.lang.Object obj8 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,(-1,null))" + "'", charSequence7.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0800");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        objMutablePair2.right = "(10.0,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0801");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair1.test0802");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.String str8 = objMutablePair0.toString("hi!");
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0803");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        objMutablePair0.right = "(null,)";
        java.lang.CharSequence charSequence6 = null;
        objMutablePair0.setRight(charSequence6);
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(4,null)" + "'", str8.equals("(4,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0804");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.String str4 = objMutablePair1.toString("((null,null),null)");
        java.lang.Object obj5 = objMutablePair1.getLeft();
        objMutablePair0.setLeft((java.lang.Object) objMutablePair1);
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((null,null),null)" + "'", str4.equals("((null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(-1,hi!))" + "'", charSequence9.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0805");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,null)");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Class<?> wildcardClass7 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0806");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
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
            System.out.format("%n%s%n", "MutablePair1.test0807");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
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
            System.out.format("%n%s%n", "MutablePair1.test0808");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
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
            System.out.format("%n%s%n", "MutablePair1.test0809");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.right = "(null,hi!)";
        java.lang.String str9 = objMutablePair0.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0810");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
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
            System.out.format("%n%s%n", "MutablePair1.test0811");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.CharSequence charSequence5 = objMutablePair1.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair1.right;
        java.lang.CharSequence charSequence7 = objMutablePair1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
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
            System.out.format("%n%s%n", "MutablePair1.test0812");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = null;
        objMutablePair2.setRight(charSequence4);
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair2.getValue();
        java.lang.Object obj9 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0813");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj7 = objMutablePair6.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj7, (java.lang.CharSequence) "(4,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0814");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        objMutablePair2.left = "(10,(null,null))";
        objMutablePair2.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0815");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = null;
        objMutablePair1.right = charSequence6;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,hi!)", (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.Class<?> wildcardClass9 = objMutablePair1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0816");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0817");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        objMutablePair0.right = "hi!";
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
            System.out.format("%n%s%n", "MutablePair1.test0818");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("((null,null),null)");
        java.lang.String str5 = objMutablePair0.toString("(-1,(null,null))");
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(4,(-1,(-1,null)))");
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((null,null),null)" + "'", str3.equals("((null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,(null,null))" + "'", str5.equals("(-1,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(4,(-1,(-1,null))))" + "'", str8.equals("(null,(4,(-1,(-1,null))))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0819");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(null,(null,))";
        objMutablePair0.right = "(4,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0820");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.CharSequence charSequence6 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair1.setValue((java.lang.CharSequence) "(a,(-1,null))");
        java.lang.Object obj9 = objMutablePair1.getLeft();
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
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0821");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0822");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setLeft((java.lang.Object) 10.0f);
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0f + "'", obj7.equals(10.0f));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0823");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj6, (java.lang.CharSequence) "(-1,(-1,(null,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0824");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0825");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0826");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,hi!)" + "'", charSequence6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!)" + "'", charSequence7.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0827");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.String str7 = objMutablePair0.toString("(null,(null,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,))" + "'", str7.equals("(null,(null,))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0828");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0829");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0830");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.GenericDeclaration> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0831");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.String str6 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null)" + "'", str6.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0832");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutablePair3.getLeft();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0833");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.String str6 = objMutablePair0.toString("(-1,hi!)");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(-1,hi!)" + "'", str6.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4' + "'", obj7.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0834");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0835");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str5 = objMutablePair0.toString("(,null)");
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(a,(-1,null))");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,null)" + "'", str5.equals("(,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0836");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.io.Serializable>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0837");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.String str4 = objMutablePair1.toString("hi!");
        objMutablePair1.right = "(-1,null)";
        java.lang.Object obj7 = objMutablePair1.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,(4,(-1,(-1,null))))", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0838");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        objMutablePair1.setRight((java.lang.CharSequence) "(null,)");
        java.lang.CharSequence charSequence5 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Object> objEntryMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Object>(objEntry0, (java.lang.Object) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,)" + "'", charSequence5.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0839");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence7 = objMutablePair6.getValue();
        java.lang.Class<?> wildcardClass8 = objMutablePair6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0840");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0841");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        java.lang.CharSequence charSequence4 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(null,null))");
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
            System.out.format("%n%s%n", "MutablePair1.test0842");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0843");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(-1,null))");
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
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,(-1,null))" + "'", charSequence8.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0844");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        java.lang.Object obj3 = objMutablePair2.getKey();
        objMutablePair2.right = "(null,(-1,null))";
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "(null,(-1,null))", charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0845");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) annotatedElementMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        java.lang.CharSequence charSequence6 = objMutablePair3.setValue((java.lang.CharSequence) "(-1,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0846");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0847");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(null,(4,(-1,(-1,null))))", (java.lang.Comparable<java.lang.String>) "(null,(4,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0848");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        objMutablePair2.right = "(4,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0849");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0850");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.String str5 = objMutablePair2.toString("hi!");
        objMutablePair2.setRight((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = objMutablePair2.getLeft();
        objMutablePair0.setLeft(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0851");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0852");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        objMutablePair0.right = "(null,)";
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,)" + "'", charSequence7.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0853");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.CharSequence charSequence5 = objMutablePair1.getValue();
        java.lang.Object obj6 = objMutablePair1.left;
        java.lang.CharSequence charSequence7 = objMutablePair1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
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
            System.out.format("%n%s%n", "MutablePair1.test0854");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0855");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
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
            System.out.format("%n%s%n", "MutablePair1.test0856");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.CharSequence> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(4,(-1,(-1,null)))", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0857");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0858");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Object> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Object>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0859");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        objMutablePair0.right = "(10.0,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0860");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.left;
        objMutablePair0.right = "(10.0,hi!)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0861");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.io.Serializable> strMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of("(4,(null,null))", (java.io.Serializable) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0862");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.String str7 = objMutablePair0.toString("(null,(-1,null))");
        objMutablePair0.right = "(null,(null,hi!))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,null))" + "'", str7.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0863");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        objMutablePair0.setRight((java.lang.CharSequence) "(4,(-1,(-1,null)))");
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
            System.out.format("%n%s%n", "MutablePair1.test0864");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass6, (java.lang.CharSequence) "(null,(null,(-1,null)))");
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0865");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) "(null,(null,hi!))");
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "(null,(null,hi!))" + "'", obj9.equals("(null,(null,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0866");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "hi!";
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.String str9 = objMutablePair0.toString("");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0867");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj3, charSequence5);
        java.lang.String str7 = objMutablePair6.toString();
        java.lang.Object obj8 = null;
        objMutablePair6.left = obj8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0868");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0869");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement2 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, annotatedElement2);
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0870");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.Type> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0871");
        java.lang.Class<?> wildcardClass0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj4 = objMutablePair3.getLeft();
        java.lang.Object obj5 = objMutablePair3.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> wildcardClassPair6 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        objMutablePair3.right = "(null,(null,(-1,(-1,null))))";
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
            System.out.format("%n%s%n", "MutablePair1.test0872");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = null;
        objMutablePair0.setRight(charSequence5);
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0873");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null)" + "'", str6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0874");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = null;
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue(charSequence6);
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
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0875");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement2 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, annotatedElement2);
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0876");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.String str6 = objMutablePair0.toString("(-1,hi!)");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(-1,hi!)" + "'", str6.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0877");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        java.lang.CharSequence charSequence4 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,)" + "'", charSequence4.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0878");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair2.right = "hi!";
        java.lang.String str6 = objMutablePair2.toString("(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", str6.equals("(null,(null,(-1,(-1,null))))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0879");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.Object obj5 = null;
        objMutablePair0.setLeft(obj5);
        java.lang.Class<?> wildcardClass7 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0880");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        objMutablePair0.right = "(null,(-1,hi!))";
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,(-1,hi!)))" + "'", str9.equals("(null,(null,(-1,hi!)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0881");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(10.0,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(4,(null,null))" + "'", str7.equals("(4,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0882");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.right = "(-1,null)";
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
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0883");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(null,(-1,null)))");
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(null,(-1,null)))" + "'", charSequence8.equals("(null,(null,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0884");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        objMutablePair2.left = "(null,hi!)";
        java.lang.CharSequence charSequence5 = objMutablePair2.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair2.getRight();
        objMutablePair2.setRight((java.lang.CharSequence) "(-1,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0885");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        java.lang.Object obj3 = objMutablePair2.getKey();
        objMutablePair2.right = "(null,(-1,null))";
        java.lang.CharSequence charSequence6 = objMutablePair2.getRight();
        java.lang.Object obj7 = objMutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,(-1,null))" + "'", charSequence6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0886");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair1.test0887");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0888");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        objMutablePair0.right = "(-1,(null,(-1,null)))";
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
            System.out.format("%n%s%n", "MutablePair1.test0889");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.reflect.GenericDeclaration> strMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0890");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (byte) 100, (java.lang.CharSequence) "(4,null)");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.CharSequence charSequence5 = objMutablePair2.right;
        java.lang.CharSequence charSequence6 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,(-1,hi!))" + "'", charSequence5.equals("(null,(-1,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,(-1,hi!))" + "'", charSequence6.equals("(null,(-1,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,(-1,hi!))" + "'", charSequence7.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0891");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,null)");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
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
            System.out.format("%n%s%n", "MutablePair1.test0892");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0d + "'", obj4.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0893");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
        org.junit.Assert.assertNull(obj6);
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
            System.out.format("%n%s%n", "MutablePair1.test0894");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str8 = objMutablePair0.toString("");
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0895");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,null)", objEntry1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0896");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(4,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,hi!)" + "'", charSequence6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,hi!))" + "'", str7.equals("(null,(null,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!)" + "'", charSequence9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0897");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        objMutablePair0.right = "(null,(-1,hi!))";
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(-1,hi!))" + "'", charSequence9.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0898");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.CharSequence charSequence4 = null;
        objMutablePair2.setRight(charSequence4);
        java.lang.CharSequence charSequence6 = objMutablePair2.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = objMutablePair2.compareTo(objPair7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0899");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue(charSequence7);
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0900");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        java.lang.Object obj4 = objMutablePair2.getKey();
        java.lang.String str5 = objMutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(a,(-1,null))" + "'", str5.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0901");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.String str9 = objMutablePair0.toString("(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,)" + "'", str9.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0902");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "";
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>>();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) objMutablePair6);
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(10,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0903");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0904");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.String str6 = objMutablePair0.toString("(-1,hi!)");
        java.lang.String str7 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(-1,hi!)" + "'", str6.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(4,null)" + "'", str7.equals("(4,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0905");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        java.lang.String str4 = objMutablePair2.toString();
        java.lang.Object obj5 = objMutablePair2.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence7 = objMutablePair6.right;
        java.lang.CharSequence charSequence8 = objMutablePair6.getValue();
        boolean boolean9 = objMutablePair2.equals((java.lang.Object) charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(a,(-1,null))" + "'", str4.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0906");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) annotatedElementMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        java.lang.Object obj5 = objMutablePair3.getKey();
        java.lang.Object obj6 = objMutablePair3.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass8 = annotatedElementMutablePair7.getClass();
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Class<?>> objEntryPair9 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3, wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryPair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0907");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objMutablePairPair5 = org.apache.commons.lang3.tuple.Pair.of(objMutablePair3, (java.lang.Comparable<java.lang.String>) "(null,(null,hi!))");
        java.lang.CharSequence charSequence7 = objMutablePair3.setValue((java.lang.CharSequence) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePairPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0908");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        java.lang.String str9 = objMutablePair0.toString("(4,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(4,(-1,(-1,null)))" + "'", str9.equals("(4,(-1,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0909");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        objMutablePair2.right = "(null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0910");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.String str7 = objMutablePair0.toString("(null,(-1,null))");
        objMutablePair0.setRight((java.lang.CharSequence) "(10,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,null))" + "'", str7.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0911");
        java.lang.Object obj0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Class<?>> objMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of(obj0, wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0912");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0913");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(,null)");
        java.lang.Object obj5 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0914");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0915");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair2.left = 10.0d;
        java.lang.Class<?> wildcardClass5 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((java.lang.CharSequence) "(null,(-1,hi!))", (java.lang.reflect.AnnotatedElement) wildcardClass5);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElement0, (java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = annotatedElementMutablePair7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0916");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = objMutablePair0.getKey();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,null)");
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0917");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0918");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.String str7 = objMutablePair0.toString("(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,(null,null))" + "'", str7.equals("(-1,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0919");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.io.Serializable serializable3 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, serializable3);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Object obj6 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '4' + "'", obj6.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0920");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objEntryMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable>((java.lang.CharSequence) "(null,(null,(-1,hi!)))", (java.io.Serializable) objEntryMutablePair1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0921");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement2 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, annotatedElement2);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0922");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        objMutablePair2.left = "(10,(null,null))";
        java.lang.CharSequence charSequence6 = objMutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0923");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.String str5 = objMutablePair0.toString("(null,hi!)");
        java.lang.String str7 = objMutablePair0.toString("(4,null)");
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,hi!)" + "'", str5.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(4,null)" + "'", str7.equals("(4,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10 + "'", obj8.equals(10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0924");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.Object obj7 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0925");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = objPairMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj5 = objMutablePair4.getLeft();
        java.lang.String str7 = objMutablePair4.toString("(-1,(null,(-1,null)))");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> wildcardClassMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass1, (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,(null,(-1,null)))" + "'", str7.equals("(-1,(null,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0926");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(4,null)" + "'", str5.equals("(4,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(4,null)" + "'", str6.equals("(4,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0927");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.reflect.Type type6 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.Type> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.Type>((java.lang.Object) objMutablePair0, type6);
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10.0d + "'", obj8.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0928");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str2 = objMutablePair0.toString();
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.getRight();
        java.lang.String str6 = objMutablePair0.toString("(10,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null)" + "'", str2.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(10,(null,null))" + "'", str6.equals("(10,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0929");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString("(null,hi!)");
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4' + "'", obj5.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0930");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.left;
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
            System.out.format("%n%s%n", "MutablePair1.test0931");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.String str8 = objMutablePair0.toString("(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(null,(-1,null)))" + "'", str8.equals("(-1,(null,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0932");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0933");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.String str5 = objMutablePair2.toString();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair6 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) 1.0f, (java.io.Serializable) objMutablePair2);
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) "(10.0,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair2);
        java.lang.Object obj8 = objMutablePair2.getLeft();
        java.lang.Object obj9 = objMutablePair2.getLeft();
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
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0934");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "(-1,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,)" + "'", charSequence4.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0935");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!)" + "'", str8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!)" + "'", str9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0936");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass5 = strMutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objMutablePairPair6 = org.apache.commons.lang3.tuple.Pair.of(objMutablePair2, (java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.CharSequence charSequence7 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "" + "'", charSequence3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePairPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0937");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.String str5 = objMutablePair0.toString("(-1,null)");
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,null)" + "'", str5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0938");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0939");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        java.lang.Object obj5 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0940");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getKey();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(null,(-1,null)))");
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0941");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = objEntryMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0942");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = null;
        objMutablePair0.right = charSequence5;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0943");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj9 = objMutablePair0.getKey();
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0944");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,(-1,hi!)))");
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
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0945");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 1, charSequence1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0946");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence6 = null;
        objMutablePair0.right = charSequence6;
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0947");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence5, (java.lang.CharSequence) "(a,(-1,null))");
        objMutablePair7.setRight((java.lang.CharSequence) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0948");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence5 = null;
        objMutablePair0.right = charSequence5;
        java.lang.String str7 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0949");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj4 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,)");
        java.lang.Object obj7 = objMutablePair6.getKey();
        objMutablePair6.right = "(null,(null,(-1,(-1,null))))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0950");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence4 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0951");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutablePair1.getKey();
        objMutablePair1.right = "(-1,null)";
        java.lang.Object obj5 = objMutablePair1.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj5, (java.lang.CharSequence) "(null,)");
        java.lang.Object obj8 = objMutablePair7.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,(null,(-1,null)))", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0952");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0953");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.String str6 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(null,(-1,null)))" + "'", str6.equals("(null,(null,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0954");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0955");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        objMutablePair3.right = "(a,(-1,null))";
        java.lang.CharSequence charSequence6 = objMutablePair3.getValue();
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = objMutablePair3.setValue(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(a,(-1,null))" + "'", charSequence6.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(a,(-1,null))" + "'", charSequence8.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0956");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) annotatedElementMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        objMutablePair3.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.Object obj7 = objMutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0957");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair2.right = "hi!";
        java.lang.Class<?> wildcardClass5 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass5, "(-1,(null,(-1,null)))");
        java.lang.Class<?> wildcardClass8 = genericDeclarationPair7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0958");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = null;
        objMutablePair0.setRight(charSequence5);
        java.lang.Object obj7 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0959");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.String str7 = objMutablePair0.toString("(null,(-1,hi!))");
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(10,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,hi!))" + "'", str7.equals("(null,(-1,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0960");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass4 = objMutablePair3.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass4, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Class<?>> strPair8 = org.apache.commons.lang3.tuple.Pair.of("(-1,hi!)", wildcardClass4);
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparablePair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "((null,null),null)", (java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0961");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0962");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
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
            System.out.format("%n%s%n", "MutablePair1.test0963");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '4' + "'", obj4.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0964");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,(-1,null))", "hi!");
        java.lang.Class<?> wildcardClass3 = strComparableMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0965");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence5, (java.lang.CharSequence) "(a,(-1,null))");
        objMutablePair7.setRight((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0966");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.Object obj4 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objMutablePairMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of(objMutablePair0, (java.lang.Comparable<java.lang.String>) "(null,null)");
        java.lang.Class<?> wildcardClass7 = objMutablePairMutablePair6.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement8 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.Type) wildcardClass7, annotatedElement8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePairMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0967");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("(-1,(null,null))", (java.lang.Comparable<java.lang.String>) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0968");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(-1,hi!))" + "'", str8.equals("(-1,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0969");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strComparableMutablePair0.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.lang.CharSequence> typePair3 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.Type) wildcardClass1, (java.lang.CharSequence) "(null,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0970");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.Class<?> wildcardClass6 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair1, (java.lang.CharSequence) "(null,null)");
        java.lang.String str9 = objMutablePair8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((null,null),(null,null))" + "'", str9.equals("((null,null),(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0971");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objEntryMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
        objMutablePair0.setLeft((java.lang.Object) objEntryMutablePair6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0972");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair4.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair4.right;
        java.lang.String str9 = objMutablePair4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0973");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.Object obj9 = objMutablePair0.getLeft();
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0974");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = objMutablePair0.compareTo(objPair7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10.0d + "'", obj6.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0975");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Class<?> wildcardClass3 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0976");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("((null,null),null)");
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(10,null)";
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((null,null),null)" + "'", str3.equals("((null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0977");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "hi!";
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0978");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0979");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.String str4 = objMutablePair2.toString();
        objMutablePair2.right = "hi!";
        objMutablePair2.right = "(null,(null,hi!))";
        java.lang.CharSequence charSequence9 = objMutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(a,(-1,null))" + "'", str4.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(null,hi!))" + "'", charSequence9.equals("(null,(null,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0980");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        objMutablePair0.right = "(-1,(null,null))";
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
            System.out.format("%n%s%n", "MutablePair1.test0981");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.String str3 = objMutablePair0.toString("(10.0,hi!)");
        java.lang.Object obj4 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(10.0,hi!)" + "'", str3.equals("(10.0,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0982");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.String str8 = objMutablePair0.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0983");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0984");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString("(-1,null)");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(-1,null)" + "'", str6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0985");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0986");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '4' + "'", obj6.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0987");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable> typeMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable>((java.lang.reflect.Type) wildcardClass1, (java.io.Serializable) strComparableMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0988");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.String str8 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair1.test0989");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,hi!)" + "'", charSequence9.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0990");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0991");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
            System.out.format("%n%s%n", "MutablePair1.test0992");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0993");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue(charSequence3);
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,(-1,hi!)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0994");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.String str6 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0995");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0996");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.Comparable<java.lang.String>> objPair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) objMutablePair0, (java.lang.Comparable<java.lang.String>) "(null,(null,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0997");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "hi!", (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.getKey();
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        java.lang.Object obj5 = objMutablePair2.getKey();
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
            System.out.format("%n%s%n", "MutablePair1.test0998");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,)");
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test0999");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence6 = null;
        objMutablePair0.right = charSequence6;
        java.lang.Object obj8 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.test1000");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutablePair2.equals(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}

