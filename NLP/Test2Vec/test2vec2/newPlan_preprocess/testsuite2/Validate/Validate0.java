package Validate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Validate0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test01");
        org.apache.commons.lang3.Validate.validState(true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test02");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern(charSequence0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test03");
        org.apache.commons.lang3.Validate.isTrue(true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test04");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 100.0f, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test05");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { 1, (byte) 1, "hi!", (byte) 1, 'a', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.Validate.validIndex(serializableArray6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test06");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test07");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.validIndex((java.lang.Comparable<java.lang.String>[]) strArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test08");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test09");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 1, (-1.0f), 1.0d };
        org.apache.commons.lang3.Validate.validState(true, "", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test10");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test11");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test12");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 100L, (-1L), 0, 100.0d };
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.notNull(objArray7);
        org.apache.commons.lang3.Validate.validState(true, "", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test13");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 100L, (-1L), 0, 100.0d };
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.notNull(objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test14");
        java.lang.Object[] objArray2 = null;
        org.apache.commons.lang3.Validate.validState(true, "", objArray2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test15");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test16");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[] strComparableArray9 = org.apache.commons.lang3.Validate.validIndex((java.lang.Comparable<java.lang.String>[]) strArray7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test17");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notEmpty("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test18");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "" + "'", charSequence1.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test19");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test20");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test21");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.Validate.notBlank("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is blank");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test22");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The validated state is false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test23");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 100L, (-1L), 0, 100.0d };
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.notNull(objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.notEmpty("", "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test24");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test25");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 100.0d, 1.0f };
        java.lang.String str6 = org.apache.commons.lang3.Validate.notNull("", "", objArray5);
        java.lang.Class<?> wildcardClass7 = objArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test26");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test27");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test28");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 100.0d, 1.0f };
        java.lang.String str8 = org.apache.commons.lang3.Validate.notNull("", "", objArray7);
        org.apache.commons.lang3.Validate.isTrue(true, "", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test29");
        org.apache.commons.lang3.Validate validate5 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, validate5 };
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", objArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test30");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test31");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The string  does not match the pattern hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test32");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test33");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test34");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        org.apache.commons.lang3.Validate validate1 = org.apache.commons.lang3.Validate.notNull(validate0);
        java.lang.Object obj2 = org.apache.commons.lang3.Validate.notNull((java.lang.Object) validate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test35");
        org.apache.commons.lang3.Validate validate5 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, validate5 };
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", objArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notNull("", "", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test36");
        org.apache.commons.lang3.Validate[] validateArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[] validateArray2 = org.apache.commons.lang3.Validate.validIndex(validateArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test37");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = org.apache.commons.lang3.Validate.notEmpty(genericDeclarationArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test38");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified inclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test39");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test40");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray9 = org.apache.commons.lang3.Validate.validIndex((java.io.Serializable[]) strArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test41");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is blank");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test42");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test43");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), '4', 0L, 100.0d, (byte) -1 };
        org.apache.commons.lang3.Validate.validState(true, "", objArray7);
        java.lang.Class<?> wildcardClass9 = objArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test44");
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', 10.0d };
        org.apache.commons.lang3.Validate.validState(true, "hi!", objArray6);
        org.apache.commons.lang3.Validate.validState(true, "", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test45");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test46");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notBlank("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test47");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] { 0L, (short) -1, (short) 10, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray6 = org.apache.commons.lang3.Validate.validIndex(serializableArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test48");
        org.apache.commons.lang3.Validate.isTrue(true, "", 0L);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test49");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (byte) 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test50");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test51");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of  to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test52");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 100L, (-1L), 0, 100.0d };
        java.lang.Object[] objArray6 = org.apache.commons.lang3.Validate.notNull(objArray5);
        java.lang.Class<?> wildcardClass7 = objArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test53");
        org.apache.commons.lang3.Validate validate5 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, validate5 };
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", objArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test54");
        org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test55");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Class<?> wildcardClass1 = validate0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test56");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test57");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notEmpty(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test58");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.CharSequence[] charSequenceArray9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test59");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) '4');
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test60");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test62");
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test63");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test64");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "" + "'", strComparable1.equals(""));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test65");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test66");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.CharSequence[] charSequenceArray9 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test67");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test68");
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test69");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.Validate.notEmpty("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test70");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 'a');
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test71");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test72");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test73");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 10.0d };
        org.apache.commons.lang3.Validate.validState(true, "hi!", objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test74");
        org.apache.commons.lang3.Validate.isTrue(true, "", 100.0d);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test75");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test76");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 100L, (-1L), 0, 100.0d };
        java.lang.Object[] objArray6 = org.apache.commons.lang3.Validate.notNull(objArray5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test77");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notNull("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test78");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test79");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray0, objArray1, objArray2, objArray3 };
        java.lang.Object[][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test80");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notEmpty(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test81");
        org.apache.commons.lang3.Validate validate5 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, validate5 };
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", objArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test82");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test83");
        org.apache.commons.lang3.Validate.isTrue(true, "", 0.0d);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test84");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test85");
        org.apache.commons.lang3.Validate validate5 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, validate5 };
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("", "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }
}

