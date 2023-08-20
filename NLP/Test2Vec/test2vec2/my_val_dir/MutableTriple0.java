
package MutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableTriple0 {

    public static boolean debug = false;

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test01");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        objMutableTriple3.setRight((java.lang.CharSequence) "hi!");
        java.lang.Object obj9 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test02");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        java.lang.Class<?> wildcardClass5 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test03");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        java.lang.String str7 = objMutableTriple3.middle;
        boolean boolean9 = objMutableTriple3.equals((java.lang.Object) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test04");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        int int8 = objMutableTriple3.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence>) objMutableTriple7);
        java.lang.String str9 = objMutableTriple7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,hi!,)" + "'", str9.equals("(-1,hi!,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test05");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.Class<?> wildcardClass5 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test06");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 10L);
        java.lang.String str9 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test07");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.Object obj5 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test08");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        objMutableTriple3.setRight((java.lang.CharSequence) "");
        objMutableTriple3.setRight((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test09");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) objMutableTriple3, "hi!", (java.lang.CharSequence) "(-1,hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test10");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 10L);
        java.lang.String str9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test11");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.getMiddle();
        java.lang.String str7 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test12");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test13");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        java.lang.String str5 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test14");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        boolean boolean8 = objMutableTriple3.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test15");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.Class<?>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test16");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        objMutableTriple3.setRight((java.lang.CharSequence) "");
        boolean boolean8 = objMutableTriple3.equals((java.lang.Object) 0L);
        java.lang.String str9 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,hi!,)" + "'", str9.equals("(-1,hi!,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test17");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        java.lang.String str7 = objMutableTriple3.middle;
        objMutableTriple3.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test18");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        objMutableTriple3.middle = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test19");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        java.lang.String str8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test20");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str6 = objMutableTriple5.getMiddle();
        objMutableTriple5.setLeft((java.lang.Object) 0.0d);
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.io.Serializable> objTriple9 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) 1, (java.lang.CharSequence) "", (java.io.Serializable) objMutableTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test21");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test22");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        objMutableTriple3.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test23");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        java.lang.String str7 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test24");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.io.Serializable, java.lang.CharSequence> charSequenceMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.io.Serializable, java.lang.CharSequence>((java.lang.CharSequence) "(-1,hi!,)", (java.io.Serializable) true, (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = charSequenceMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test25");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        objMutableTriple3.setRight((java.lang.CharSequence) "(-1,hi!,)");
        java.lang.String str6 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test26");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        java.lang.String str6 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test27");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence>> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test28");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        java.lang.String str7 = objMutableTriple3.middle;
        java.lang.String str8 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test29");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        java.lang.String str8 = objMutableTriple3.getMiddle();
        java.lang.String str9 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,hi!,)" + "'", str9.equals("(-1,hi!,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test30");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        java.lang.String str7 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) -1 + "'", obj6.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test31");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 10L);
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test32");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.getMiddle();
        java.lang.Object obj7 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test33");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test34");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test35");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        objMutableTriple3.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) -1 + "'", obj6.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test36");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str5 = objMutableTriple3.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test37");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        int int8 = objMutableTriple3.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence>) objMutableTriple7);
        java.lang.String str9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test38");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        objMutableTriple3.right = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test39");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.String str5 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test40");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass9 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test41");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.CharSequence, java.lang.Class<?>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.CharSequence, java.lang.Class<?>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test42");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj6 = objMutableTriple5.left;
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.io.Serializable, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence>> strComparableTriple7 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Comparable<java.lang.String>) "(-1,hi!,)", (java.io.Serializable) (-1.0f), (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence>) objMutableTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) -1 + "'", obj6.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableTriple7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test43");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        boolean boolean9 = objMutableTriple3.equals((java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test44");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.getMiddle();
        java.lang.String str8 = objMutableTriple3.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test45");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.middle;
        boolean boolean8 = objMutableTriple3.equals((java.lang.Object) 'a');
        java.lang.Object obj9 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test46");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        objMutableTriple3.setMiddle("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test47");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        java.lang.Object obj8 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0.0d + "'", obj8.equals(0.0d));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test48");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        objMutableTriple3.setRight((java.lang.CharSequence) "(-1,hi!,)");
        objMutableTriple3.middle = "";
        java.lang.String str8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test49");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        objMutableTriple3.setMiddle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test50");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.String str6 = objMutableTriple3.getMiddle();
        objMutableTriple3.middle = "(-1,hi!,)";
        java.lang.String str9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) -1 + "'", obj4.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,hi!,)" + "'", str5.equals("(-1,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,hi!,)" + "'", str9.equals("(-1,hi!,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test51");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle("hi!");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test52");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.CharSequence>((java.lang.Object) (byte) -1, "hi!", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) 0.0d);
        java.lang.String str7 = objMutableTriple3.middle;
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0.0d + "'", obj8.equals(0.0d));
    }
}

