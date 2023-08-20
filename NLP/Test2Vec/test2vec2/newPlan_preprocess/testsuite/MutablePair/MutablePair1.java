package MutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutablePair1 {

    public static boolean debug = false;

    @Test
    public void MutablePair0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0501");
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
    public void MutablePair0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0502");
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
    public void MutablePair0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0503");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequenceMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.CharSequence) "(10.0,hi!)", objPair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutablePair2);
    }

    @Test
    public void MutablePair0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0504");
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
    public void MutablePair0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0505");
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
    public void MutablePair0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0506");
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
    public void MutablePair0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0507");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0508");
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
    public void MutablePair0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0509");
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
    public void MutablePair0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0510");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objPairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0511");
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
    public void MutablePair0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0512");
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
    public void MutablePair0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0513");
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
    public void MutablePair0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0514");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(null,(null,))", (java.lang.CharSequence) "(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0515");
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
    public void MutablePair0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0516");
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
    public void MutablePair0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0517");
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
    public void MutablePair0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0518");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = objMutablePairMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0519");
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
    public void MutablePair0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0520");
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
    public void MutablePair0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0521");
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
    public void MutablePair0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0522");
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
    public void MutablePair0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0523");
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
    public void MutablePair0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0524");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(-1,null))");
    }

    @Test
    public void MutablePair0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0525");
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
    public void MutablePair0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0526");
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
    public void MutablePair0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0527");
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
    public void MutablePair0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0528");
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
    public void MutablePair0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0529");
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
    public void MutablePair0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0530");
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
    public void MutablePair0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0531");
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
    public void MutablePair0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0532");
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
    public void MutablePair0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0533");
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
    public void MutablePair0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0534");
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
    public void MutablePair0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0535");
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
    public void MutablePair0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0536");
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
    public void MutablePair0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0537");
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
    public void MutablePair0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0538");
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
    public void MutablePair0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0539");
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
    public void MutablePair0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0540");
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
    public void MutablePair0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0541");
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
    public void MutablePair0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0542");
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
    public void MutablePair0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0543");
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
    public void MutablePair0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0544");
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
    public void MutablePair0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0545");
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
    public void MutablePair0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0546");
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
    public void MutablePair0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0547");
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
    public void MutablePair0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0548");
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
    public void MutablePair0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0549");
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
    public void MutablePair0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0550");
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
    public void MutablePair0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0551");
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
    public void MutablePair0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0552");
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
    public void MutablePair0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0553");
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
    public void MutablePair0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0554");
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
    public void MutablePair0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0555");
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
    public void MutablePair0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0556");
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
    public void MutablePair0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0557");
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
    public void MutablePair0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0558");
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
    public void MutablePair0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0559");
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
    public void MutablePair0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0560");
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
    public void MutablePair0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0561");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Class<?>> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0562");
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
    public void MutablePair0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0563");
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
    public void MutablePair0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0564");
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
    public void MutablePair0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0565");
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
    public void MutablePair0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0566");
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
    public void MutablePair0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0567");
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
    public void MutablePair0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0568");
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
    public void MutablePair0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0569");
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
    public void MutablePair0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0570");
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
    public void MutablePair0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0571");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.Type> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0572");
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
    public void MutablePair0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0573");
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
    public void MutablePair0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0574");
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
    public void MutablePair0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0575");
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
    public void MutablePair0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0576");
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
    public void MutablePair0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0577");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(4,null)", objPair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0578");
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
    public void MutablePair0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0579");
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
    public void MutablePair0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0580");
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
    public void MutablePair0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0581");
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
    public void MutablePair0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0582");
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
    public void MutablePair0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0583");
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
    public void MutablePair0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0584");
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
    public void MutablePair0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0585");
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
    public void MutablePair0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0586");
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
    public void MutablePair0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0587");
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
    public void MutablePair0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0588");
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
    public void MutablePair0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0589");
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
    public void MutablePair0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0590");
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
    public void MutablePair0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0591");
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
    public void MutablePair0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0592");
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
    public void MutablePair0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0593");
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
    public void MutablePair0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0594");
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
    public void MutablePair0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0595");
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
    public void MutablePair0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0596");
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
    public void MutablePair0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0597");
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
    public void MutablePair0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0598");
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
    public void MutablePair0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0599");
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
    public void MutablePair0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0600");
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
    public void MutablePair0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0601");
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
    public void MutablePair0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0602");
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
    public void MutablePair0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0603");
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
    public void MutablePair0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0604");
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
    public void MutablePair0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0605");
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
    public void MutablePair0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0606");
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
    public void MutablePair0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0607");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = "(4,(null,null))";
    }

    @Test
    public void MutablePair0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0608");
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
    public void MutablePair0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0609");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(-1,(null,null))");
        java.lang.CharSequence charSequence4 = objMutablePair2.setValue((java.lang.CharSequence) "(10.0,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,(null,null))" + "'", charSequence4.equals("(-1,(null,null))"));
    }

    @Test
    public void MutablePair0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0610");
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
    public void MutablePair0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0611");
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
    public void MutablePair0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0612");
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
    public void MutablePair0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0613");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void MutablePair0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0614");
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
    public void MutablePair0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0615");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable>();
    }

    @Test
    public void MutablePair0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0616");
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
    public void MutablePair0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0617");
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
    public void MutablePair0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0618");
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
    public void MutablePair0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0619");
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
    public void MutablePair0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0620");
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
    public void MutablePair0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0621");
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
    public void MutablePair0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0622");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutablePair0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0623");
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
    public void MutablePair0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0624");
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
    public void MutablePair0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0625");
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
    public void MutablePair0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0626");
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
    public void MutablePair0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0627");
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
    public void MutablePair0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0628");
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
    public void MutablePair0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0629");
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
    public void MutablePair0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0630");
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
    public void MutablePair0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0631");
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
    public void MutablePair0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0632");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "(null,(null,(-1,(-1,null))))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
    }

    @Test
    public void MutablePair0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0633");
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
    public void MutablePair0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0634");
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
    public void MutablePair0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0635");
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
    public void MutablePair0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0636");
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
    public void MutablePair0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0637");
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
    public void MutablePair0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0638");
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
    public void MutablePair0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0639");
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
    public void MutablePair0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0640");
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
    public void MutablePair0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0641");
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
    public void MutablePair0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0642");
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
    public void MutablePair0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0643");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0644");
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
    public void MutablePair0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0645");
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
    public void MutablePair0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0646");
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
    public void MutablePair0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0647");
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
    public void MutablePair0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0648");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0649");
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
    public void MutablePair0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0650");
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
    public void MutablePair0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0651");
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
    public void MutablePair0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0652");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(-1,(null,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0653");
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
    public void MutablePair0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0654");
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
    public void MutablePair0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0655");
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
    public void MutablePair0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0656");
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
    public void MutablePair0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0657");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        objMutablePair0.right = "(null,hi!)";
        objMutablePair0.right = "(-1,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutablePair0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0658");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0659");
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
    public void MutablePair0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0660");
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
    public void MutablePair0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0661");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0662");
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
    public void MutablePair0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0663");
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
    public void MutablePair0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0664");
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
    public void MutablePair0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0665");
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
    public void MutablePair0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0666");
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
    public void MutablePair0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0667");
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
    public void MutablePair0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0668");
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
    public void MutablePair0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0669");
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
    public void MutablePair0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0670");
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
    public void MutablePair0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0671");
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
    public void MutablePair0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0672");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0673");
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
    public void MutablePair0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0674");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "((null,null),null)", "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
    }

    @Test
    public void MutablePair0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0675");
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
    public void MutablePair0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0676");
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
    public void MutablePair0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0677");
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
    public void MutablePair0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0678");
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
    public void MutablePair0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0679");
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
    public void MutablePair0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0680");
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
    public void MutablePair0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0681");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Object>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) annotatedElementMutablePair0, (java.lang.CharSequence) "(null,)");
    }

    @Test
    public void MutablePair0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0682");
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
    public void MutablePair0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0683");
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
    public void MutablePair0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0684");
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
    public void MutablePair0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0685");
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
    public void MutablePair0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0686");
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
    public void MutablePair0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0687");
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
    public void MutablePair0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0688");
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
    public void MutablePair0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0689");
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
    public void MutablePair0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0690");
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
    public void MutablePair0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0691");
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
    public void MutablePair0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0692");
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
    public void MutablePair0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0693");
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
    public void MutablePair0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0694");
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
    public void MutablePair0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0695");
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
    public void MutablePair0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0696");
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
    public void MutablePair0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0697");
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
    public void MutablePair0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0698");
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
    public void MutablePair0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0699");
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
    public void MutablePair0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0700");
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
    public void MutablePair0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0701");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair2.right = "hi!";
        java.lang.CharSequence charSequence5 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutablePair0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0702");
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
    public void MutablePair0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0703");
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
    public void MutablePair0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0704");
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
    public void MutablePair0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0705");
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
    public void MutablePair0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0706");
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
    public void MutablePair0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0707");
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
    public void MutablePair0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0708");
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
    public void MutablePair0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0709");
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
    public void MutablePair0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0710");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>("(null,(-1,null))", objPair1);
    }

    @Test
    public void MutablePair0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0711");
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
    public void MutablePair0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0712");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0713");
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
    public void MutablePair0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0714");
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
    public void MutablePair0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0715");
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
    public void MutablePair0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0716");
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
    public void MutablePair0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0717");
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
    public void MutablePair0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0718");
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
    public void MutablePair0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0719");
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
    public void MutablePair0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0720");
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
    public void MutablePair0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0721");
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
    public void MutablePair0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0722");
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
    public void MutablePair0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0723");
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
    public void MutablePair0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0724");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence4 = objMutablePair2.setValue((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        java.lang.Object obj5 = objMutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
    }

    @Test
    public void MutablePair0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0725");
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
    public void MutablePair0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0726");
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
    public void MutablePair0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0727");
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
    public void MutablePair0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0728");
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
    public void MutablePair0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0729");
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
    public void MutablePair0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0730");
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
    public void MutablePair0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0731");
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
    public void MutablePair0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0732");
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
    public void MutablePair0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0733");
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
    public void MutablePair0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0734");
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
    public void MutablePair0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0735");
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
    public void MutablePair0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0736");
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
    public void MutablePair0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0737");
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
    public void MutablePair0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0738");
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
    public void MutablePair0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0739");
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
    public void MutablePair0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0740");
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
    public void MutablePair0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0741");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Class<?>> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0742");
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
    public void MutablePair0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0743");
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
    public void MutablePair0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0744");
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
    public void MutablePair0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0745");
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
    public void MutablePair0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0746");
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
    public void MutablePair0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0747");
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
    public void MutablePair0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0748");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,(-1,hi!))" + "'", str3.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0749");
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
    public void MutablePair0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0750");
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
    public void MutablePair0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0751");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((java.lang.CharSequence) "(null,)", (java.lang.reflect.AnnotatedElement) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutablePair0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0752");
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
    public void MutablePair0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0753");
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
    public void MutablePair0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0754");
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
    public void MutablePair0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0755");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        objMutablePair0.right = "(null,(null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutablePair0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0756");
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
    public void MutablePair0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0757");
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
    public void MutablePair0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0758");
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
    public void MutablePair0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0759");
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
    public void MutablePair0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0760");
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
    public void MutablePair0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0761");
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
    public void MutablePair0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0762");
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
    public void MutablePair0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0763");
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
    public void MutablePair0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0764");
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
    public void MutablePair0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0765");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(4,(-1,(-1,null)))", (java.lang.Comparable<java.lang.String>) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0766");
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
    public void MutablePair0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0767");
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
    public void MutablePair0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0768");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.String str2 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null)" + "'", str2.equals("(null,null)"));
    }

    @Test
    public void MutablePair0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0769");
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
    public void MutablePair0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0770");
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
    public void MutablePair0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0771");
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
    public void MutablePair0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0772");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(4,(null,null))", (java.lang.Comparable<java.lang.String>) "(null,)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "(null,)", (java.lang.CharSequence) "(null,(null,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0773");
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
    public void MutablePair0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0774");
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
    public void MutablePair0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0775");
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
    public void MutablePair0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0776");
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
    public void MutablePair0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0777");
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
    public void MutablePair0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0778");
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
    public void MutablePair0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0779");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) annotatedElementMutablePair0, (java.lang.CharSequence) "(a,(-1,null))");
        java.lang.String str4 = objMutablePair2.toString("(null,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,(null,null))" + "'", str4.equals("(null,(null,null))"));
    }

    @Test
    public void MutablePair0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0780");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = charSequenceMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass1, (java.lang.CharSequence) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementMutablePair3);
    }

    @Test
    public void MutablePair0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0781");
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
    public void MutablePair0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0782");
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
    public void MutablePair0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0783");
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
    public void MutablePair0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0784");
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
    public void MutablePair0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0785");
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
    public void MutablePair0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0786");
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
    public void MutablePair0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0787");
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
    public void MutablePair0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0788");
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
    public void MutablePair0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0789");
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
    public void MutablePair0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0790");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutablePair0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0791");
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
    public void MutablePair0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0792");
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
    public void MutablePair0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0793");
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
    public void MutablePair0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0794");
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
    public void MutablePair0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0795");
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
    public void MutablePair0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0796");
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
    public void MutablePair0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0797");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.io.Serializable>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) annotatedElementMutablePair0, (java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,hi!)" + "'", charSequence3.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0798");
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
    public void MutablePair0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0799");
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
    public void MutablePair0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0800");
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
    public void MutablePair0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0801");
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
    public void MutablePair0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0802");
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
    public void MutablePair0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0803");
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
    public void MutablePair0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0804");
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
    public void MutablePair0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0805");
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
    public void MutablePair0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0806");
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
    public void MutablePair0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0807");
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
    public void MutablePair0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0808");
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
    public void MutablePair0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0809");
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
    public void MutablePair0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0810");
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
    public void MutablePair0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0811");
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
    public void MutablePair0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0812");
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
    public void MutablePair0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0813");
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
    public void MutablePair0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0814");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        objMutablePair2.left = "(10,(null,null))";
        objMutablePair2.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
    }

    @Test
    public void MutablePair0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0815");
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
    public void MutablePair0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0816");
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
    public void MutablePair0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0817");
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
    public void MutablePair0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0818");
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
    public void MutablePair0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0819");
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
    public void MutablePair0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0820");
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
    public void MutablePair0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0821");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getKey();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0822");
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
    public void MutablePair0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0823");
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
    public void MutablePair0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0824");
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
    public void MutablePair0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0825");
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
    public void MutablePair0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0826");
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
    public void MutablePair0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0827");
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
    public void MutablePair0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0828");
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
    public void MutablePair0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0829");
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
    public void MutablePair0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0830");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.GenericDeclaration> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutablePair0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0831");
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
    public void MutablePair0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0832");
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
    public void MutablePair0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0833");
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
    public void MutablePair0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0834");
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
    public void MutablePair0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0835");
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
    public void MutablePair0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0836");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.io.Serializable>();
    }

    @Test
    public void MutablePair0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0837");
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
    public void MutablePair0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0838");
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
    public void MutablePair0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0839");
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
    public void MutablePair0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0840");
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
    public void MutablePair0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0841");
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
    public void MutablePair0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0842");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0843");
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
    public void MutablePair0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0844");
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
    public void MutablePair0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0845");
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
    public void MutablePair0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0846");
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
    public void MutablePair0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0847");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(null,(4,(-1,(-1,null))))", (java.lang.Comparable<java.lang.String>) "(null,(4,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0848");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        objMutablePair2.right = "(4,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
    }

    @Test
    public void MutablePair0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0849");
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
    public void MutablePair0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0850");
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
    public void MutablePair0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0851");
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
    public void MutablePair0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0852");
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
    public void MutablePair0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0853");
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
    public void MutablePair0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0854");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0855");
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
    public void MutablePair0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0856");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.CharSequence> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(4,(-1,(-1,null)))", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0857");
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
    public void MutablePair0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0858");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Object> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Object>();
    }

    @Test
    public void MutablePair0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0859");
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
    public void MutablePair0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0860");
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
    public void MutablePair0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0861");
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
    public void MutablePair0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0862");
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
    public void MutablePair0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0863");
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
    public void MutablePair0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0864");
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
    public void MutablePair0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0865");
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
    public void MutablePair0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0866");
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
    public void MutablePair0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0867");
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
    public void MutablePair0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0868");
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
    public void MutablePair0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0869");
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
    public void MutablePair0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0870");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.Type> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0871");
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
    public void MutablePair0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0872");
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
    public void MutablePair0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0873");
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
    public void MutablePair0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0874");
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
    public void MutablePair0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0875");
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
    public void MutablePair0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0876");
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
    public void MutablePair0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0877");
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
    public void MutablePair0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0878");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair2.right = "hi!";
        java.lang.String str6 = objMutablePair2.toString("(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", str6.equals("(null,(null,(-1,(-1,null))))"));
    }

    @Test
    public void MutablePair0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0879");
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
    public void MutablePair0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0880");
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
    public void MutablePair0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0881");
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
    public void MutablePair0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0882");
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
    public void MutablePair0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0883");
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
    public void MutablePair0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0884");
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
    public void MutablePair0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0885");
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
    public void MutablePair0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0886");
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
    public void MutablePair0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0887");
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
    public void MutablePair0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0888");
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
    public void MutablePair0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0889");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.reflect.GenericDeclaration> strMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutablePair0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0890");
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
    public void MutablePair0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0891");
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
    public void MutablePair0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0892");
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
    public void MutablePair0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0893");
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
    public void MutablePair0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0894");
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
    public void MutablePair0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0895");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,null)", objEntry1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
    }

    @Test
    public void MutablePair0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0896");
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
    public void MutablePair0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0897");
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
    public void MutablePair0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0898");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.CharSequence charSequence4 = null;
        objMutablePair2.setRight(charSequence4);
        java.lang.CharSequence charSequence6 = objMutablePair2.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0899");
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
    public void MutablePair0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0900");
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
    public void MutablePair0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0901");
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
    public void MutablePair0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0902");
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
    public void MutablePair0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0903");
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
    public void MutablePair0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0904");
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
    public void MutablePair0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0905");
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
    public void MutablePair0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0906");
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
    public void MutablePair0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0907");
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
    public void MutablePair0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0908");
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
    public void MutablePair0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0909");
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
    public void MutablePair0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0910");
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
    public void MutablePair0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0911");
        java.lang.Object obj0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Class<?>> objMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of(obj0, wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair2);
    }

    @Test
    public void MutablePair0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0912");
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
    public void MutablePair0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0913");
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
    public void MutablePair0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0914");
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
    public void MutablePair0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0915");
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
    public void MutablePair0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0916");
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
    public void MutablePair0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0917");
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
    public void MutablePair0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0918");
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
    public void MutablePair0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0919");
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
    public void MutablePair0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0920");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objEntryMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable>((java.lang.CharSequence) "(null,(null,(-1,hi!)))", (java.io.Serializable) objEntryMutablePair1);
    }

    @Test
    public void MutablePair0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0921");
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
    public void MutablePair0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0922");
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
    public void MutablePair0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0923");
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
    public void MutablePair0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0924");
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
    public void MutablePair0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0925");
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
    public void MutablePair0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0926");
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
    public void MutablePair0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0927");
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
    public void MutablePair0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0928");
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
    public void MutablePair0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0929");
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
    public void MutablePair0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0930");
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
    public void MutablePair0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0931");
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
    public void MutablePair0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0932");
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
    public void MutablePair0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0933");
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
    public void MutablePair0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0934");
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
    public void MutablePair0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0935");
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
    public void MutablePair0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0936");
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
    public void MutablePair0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0937");
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
    public void MutablePair0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0938");
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
    public void MutablePair0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0939");
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
    public void MutablePair0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0940");
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
    public void MutablePair0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0941");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = objEntryMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0942");
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
    public void MutablePair0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0943");
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
    public void MutablePair0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0944");
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
    public void MutablePair0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0945");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 1, charSequence1);
    }

    @Test
    public void MutablePair0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0946");
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
    public void MutablePair0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0947");
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
    public void MutablePair0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0948");
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
    public void MutablePair0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0949");
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
    public void MutablePair0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0950");
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
    public void MutablePair0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0951");
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
    public void MutablePair0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0952");
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
    public void MutablePair0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0953");
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
    public void MutablePair0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0954");
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
    public void MutablePair0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0955");
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
    public void MutablePair0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0956");
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
    public void MutablePair0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0957");
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
    public void MutablePair0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0958");
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
    public void MutablePair0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0959");
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
    public void MutablePair0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0960");
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
    public void MutablePair0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0961");
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
    public void MutablePair0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0962");
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
    public void MutablePair0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0963");
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
    public void MutablePair0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0964");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,(-1,null))", "hi!");
        java.lang.Class<?> wildcardClass3 = strComparableMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0965");
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
    public void MutablePair0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0966");
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
    public void MutablePair0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0967");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("(-1,(null,null))", (java.lang.Comparable<java.lang.String>) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0968");
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
    public void MutablePair0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0969");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strComparableMutablePair0.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.lang.CharSequence> typePair3 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.Type) wildcardClass1, (java.lang.CharSequence) "(null,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair3);
    }

    @Test
    public void MutablePair0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0970");
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
    public void MutablePair0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0971");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objEntryMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
        objMutablePair0.setLeft((java.lang.Object) objEntryMutablePair6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutablePair0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0972");
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
    public void MutablePair0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0973");
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
    public void MutablePair0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0974");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0975");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Class<?> wildcardClass3 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0976");
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
    public void MutablePair0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0977");
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
    public void MutablePair0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0978");
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
    public void MutablePair0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0979");
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
    public void MutablePair0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0980");
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
    public void MutablePair0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0981");
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
    public void MutablePair0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0982");
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
    public void MutablePair0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0983");
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
    public void MutablePair0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0984");
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
    public void MutablePair0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0985");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0986");
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
    public void MutablePair0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0987");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable> typeMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.io.Serializable>((java.lang.reflect.Type) wildcardClass1, (java.io.Serializable) strComparableMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0988");
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
    public void MutablePair0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0989");
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
    public void MutablePair0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0990");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0991");
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
    public void MutablePair0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0992");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String>();
    }

    @Test
    public void MutablePair0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0993");
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
    public void MutablePair0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0994");
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
    public void MutablePair0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0995");
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
    public void MutablePair0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0996");
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
    public void MutablePair0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0997");
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
    public void MutablePair0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0998");
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
    public void MutablePair0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair0999");
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
    public void MutablePair1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair1.MutablePair1000");
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

