package Validate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Validate0 {

    public static boolean debug = false;

    @Test
    public void Validate001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate001");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified inclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate002");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate003");
        java.lang.Object[] objArray2 = null;
        org.apache.commons.lang3.Validate.validState(true, "", objArray2);
    }

    @Test
    public void Validate004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate004");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified inclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate005");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 0L);
    }

    @Test
    public void Validate006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate006");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate007");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The validated state is false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate008");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.Validate.notBlank("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is blank");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate009");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate010");
        java.lang.Object obj1 = org.apache.commons.lang3.Validate.notNull((java.lang.Object) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj1 + "' != '" + (-1L) + "'", obj1.equals((-1L)));
    }

    @Test
    public void Validate011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate011");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate012");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void Validate013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate013");
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!");
    }

    @Test
    public void Validate014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate014");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void Validate015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate015");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void Validate016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate016");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate017");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate018");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", objArray7);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void Validate019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate019");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "" + "'", strComparable1.equals(""));
    }

    @Test
    public void Validate020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate020");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate021");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate022");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][] objArray2 = org.apache.commons.lang3.Validate.validIndex(objArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate023");
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "");
    }

    @Test
    public void Validate024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate024");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate025");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate026");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate027");
        org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void Validate028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate028");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "", (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate029");
        org.apache.commons.lang3.Validate.isTrue(true);
    }

    @Test
    public void Validate030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate030");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate031");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate032");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void Validate033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate033");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void Validate034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate034");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void Validate035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate035");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notBlank("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void Validate036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate036");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.validIndex((java.lang.Comparable<java.lang.String>[]) strArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void Validate037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate037");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (byte) 10);
    }

    @Test
    public void Validate038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate038");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified inclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate039");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "", "hi!", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate040");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", strComparable2, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
    }

    @Test
    public void Validate041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate041");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.Comparable<java.lang.String> strComparable6 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) charSequenceArray5);
        java.lang.Class<?> wildcardClass7 = strComparable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate042");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate043");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is blank");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate044");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) '4');
    }

    @Test
    public void Validate045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate045");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate046");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate047");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate048");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified inclusive range of hi! to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate049");
        org.apache.commons.lang3.Validate.validState(true);
    }

    @Test
    public void Validate050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate050");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate051");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.validIndex(annotatedElementArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
    }

    @Test
    public void Validate052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate052");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate053");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void Validate054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate054");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) strComparableArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate055");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate056");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of  to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate057");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 10);
    }

    @Test
    public void Validate058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate058");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate059");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate060");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate061");
        java.lang.Comparable<java.lang.String>[][] strComparableArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][] strComparableArray1 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate062");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The string  does not match the pattern hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate063");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notEmpty("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void Validate064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate064");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", objArray7);
        java.lang.String str9 = org.apache.commons.lang3.Validate.notBlank("hi!", "", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate065");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 'a');
    }

    @Test
    public void Validate066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate066");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.Comparable<java.lang.String> strComparable8 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) charSequenceArray7);
        org.apache.commons.lang3.Validate validate9 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", (java.lang.Object[]) charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate9);
    }

    @Test
    public void Validate067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate067");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate068");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "", (java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate069");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 10.0f);
    }

    @Test
    public void Validate070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate070");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate071");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (java.lang.Object[]) charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void Validate072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate072");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 0.0d);
    }

    @Test
    public void Validate073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate073");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate074");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) ' ', "hi!", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void Validate075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate075");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate076");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate077");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.notNull(strArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void Validate078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate078");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate079");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of hi! to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate080");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate081");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate082");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
    }

    @Test
    public void Validate083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate083");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.notNull(strArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void Validate084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate084");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate085");
        org.apache.commons.lang3.Validate validate2 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate5 = org.apache.commons.lang3.Validate.notNull(validate2, "hi!", objArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate5);
    }

    @Test
    public void Validate086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate086");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate087");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void Validate088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate088");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate089");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate090");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] { wildcardClass6 };
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "hi!", (java.lang.Object[]) typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate091");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate092");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate093");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (-1.0f));
    }

    @Test
    public void Validate094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate094");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate095");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate096");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 100);
    }

    @Test
    public void Validate097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate097");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 100, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate098");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The string hi! does not match the pattern ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate099");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "", (java.lang.Object[]) strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate100");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 10, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate101");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (byte) 1);
    }

    @Test
    public void Validate102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate102");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate103");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.notEmpty(validateArray0, "hi!", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void Validate104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate104");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.Validate.notEmpty("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate105");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate106");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void Validate107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate107");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) ' ');
    }

    @Test
    public void Validate108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate108");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate109");
        java.lang.Comparable<java.lang.String>[][][] strComparableArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.notNull(strComparableArray0, "", (java.lang.Object[]) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: ");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void Validate110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate110");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate111");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.notNull(strArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void Validate112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate112");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[]) strComparableArray4);
        java.io.Serializable serializable9 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void Validate113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate113");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.validIndex("hi!", 1, "", (java.lang.Object[]) strArray7);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate114");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (byte) -1);
    }

    @Test
    public void Validate115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate115");
        java.lang.Object[] objArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.Validate.notBlank("hi!", "", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void Validate116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate116");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        org.apache.commons.lang3.Validate[] validateArray1 = new org.apache.commons.lang3.Validate[] { validate0 };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notNull(strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate[] validateArray9 = org.apache.commons.lang3.Validate.validIndex(validateArray1, 1, "", (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate117");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) strComparableArray4);
        java.lang.Comparable<java.lang.String>[][] strComparableArray9 = org.apache.commons.lang3.Validate.notNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void Validate118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate118");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.validIndex("", 0, "", (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate119");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void Validate120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate120");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of  to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate121");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) strComparableArray4);
        java.lang.Object[][] objArray9 = org.apache.commons.lang3.Validate.notEmpty(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate122");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "", objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate123");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate124");
        org.apache.commons.lang3.Validate.isTrue(true, "", 10.0d);
    }

    @Test
    public void Validate125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate125");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate126");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 100, "hi!", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate127");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][] objArray6 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][]) strComparableArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void Validate128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate128");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate129");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 100, "", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void Validate130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate130");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate131");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.Validate.notBlank("", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate132");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (-1));
    }

    @Test
    public void Validate133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate133");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.Validate.notEmpty(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate134");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) 10);
    }

    @Test
    public void Validate135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate135");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "hi!", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void Validate136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate136");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) '4');
    }

    @Test
    public void Validate137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate137");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate138");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate139");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 1);
    }

    @Test
    public void Validate140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate140");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate141");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate142");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate143");
        java.lang.Object[] objArray2 = null;
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", objArray2);
    }

    @Test
    public void Validate144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate144");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate145");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void Validate146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate146");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.notNull(strComparableArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) strComparableArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate147");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate148");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notNull(strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate149");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.Validate.notEmpty(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notNull(typeArray5);
        java.lang.reflect.Type[] typeArray9 = org.apache.commons.lang3.Validate.validIndex(typeArray5, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void Validate150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate150");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate151");
        java.lang.CharSequence[][][] charSequenceArray0 = new java.lang.CharSequence[][][] {};
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence[][][] charSequenceArray1 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void Validate152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate152");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate153");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.validIndex(strComparableArray5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate154");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of hi! to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate155");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate156");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray6);
        org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "", "hi!", (java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate157");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate158");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 10);
    }

    @Test
    public void Validate159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate159");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "", (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate160");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate161");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate162");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.notNull(strArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void Validate163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate163");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate164");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate165");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate166");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate167");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate168");
        java.lang.Object[][][] objArray0 = null;
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][][] objArray9 = org.apache.commons.lang3.Validate.noNullElements(objArray0, "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate169");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 100L);
    }

    @Test
    public void Validate170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate170");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void Validate171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate171");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate172");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "", (java.lang.Object[]) strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate173");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.notNull(strArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("", "hi!", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void Validate174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate174");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate175");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate176");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Class<?> wildcardClass5 = strComparableArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate177");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate178");
        java.lang.Object[] objArray2 = null;
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "hi!", "", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + "hi!" + "'", strComparable3.equals("hi!"));
    }

    @Test
    public void Validate179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate179");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate180");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 100, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate181");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.validIndex("", 0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate182");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Class<?> wildcardClass6 = strComparableArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Validate183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate183");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate184");
        java.lang.Comparable<java.lang.String>[][][] strComparableArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray0, "hi!", (java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: hi!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void Validate185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate185");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate186");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) '#');
    }

    @Test
    public void Validate187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate187");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "", objArray6);
        java.lang.String str9 = org.apache.commons.lang3.Validate.notBlank("hi!", "", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate188");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) strComparableArray4);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[]) objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate189");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void Validate190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate190");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate191");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (byte) 1);
    }

    @Test
    public void Validate192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate192");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate193");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void Validate194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate194");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
    }

    @Test
    public void Validate195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate195");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", objArray7);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void Validate196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate196");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate197");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate198");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray3 };
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.Class<?> wildcardClass6 = charSequenceArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Validate199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate199");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.notBlank("", "", (java.lang.Object[]) typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate200");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) 0);
    }

    @Test
    public void Validate201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate201");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement6);
    }

    @Test
    public void Validate202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate202");
        java.lang.reflect.Type[][] typeArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.Type[][] typeArray2 = org.apache.commons.lang3.Validate.validIndex(typeArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate203");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        // The following exception was thrown during execution in Validate generation
        try {
            java.io.Serializable[][] serializableArray2 = org.apache.commons.lang3.Validate.validIndex(serializableArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
    }

    @Test
    public void Validate204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate204");
        java.lang.Object[] objArray3 = null;
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "", objArray3);
    }

    @Test
    public void Validate205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate205");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate206");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
    }

    @Test
    public void Validate207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate207");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 1.0f);
    }

    @Test
    public void Validate208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate208");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate209");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate210");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate211");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate212");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate213");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) ' ');
    }

    @Test
    public void Validate214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate214");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notNull(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.Validate.notEmpty(strArray2, "hi!", (java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void Validate215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate215");
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate216");
        java.lang.Object[] objArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void Validate217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate217");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.io.Serializable[][] serializableArray6 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[][]) strComparableArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.validIndex(strComparableArray4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate218");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray4);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][]) strComparableArray4);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate219");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate220");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate221");
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray5 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray6 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray7 = new java.io.Serializable[][][] { serializableArray2, serializableArray3, serializableArray4, serializableArray5, serializableArray6 };
        java.io.Serializable[][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements(serializableArray7);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate222");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) charSequenceArray7);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[]) charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate223");
        org.apache.commons.lang3.Validate.isTrue(true, "", 0L);
    }

    @Test
    public void Validate224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate224");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "", (java.lang.Object[]) strComparableArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate225");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notNull("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void Validate226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate226");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate227");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 100);
    }

    @Test
    public void Validate228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate228");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate229");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate230");
        java.lang.Object[] objArray3 = null;
        java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 1, "hi!", objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void Validate231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate231");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate232");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 100.0f);
    }

    @Test
    public void Validate233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate233");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate234");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated character sequence is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate235");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate236");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) strComparableArray4);
        java.lang.Class<?> wildcardClass9 = strComparableArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate237");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate238");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void Validate239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate239");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        java.lang.String str9 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) 1, "hi!", (java.lang.Object[]) strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate240");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.Validate.notNull(wildcardClass4);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.Validate.notNull(annotatedElement6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
    }

    @Test
    public void Validate241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate241");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "hi!", (java.lang.Object[]) strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate242");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate243");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 0);
    }

    @Test
    public void Validate244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate244");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("", "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate245");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 100);
    }

    @Test
    public void Validate246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate246");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.notNull(strArray5);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "", (java.lang.Object[]) strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate247");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate248");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 10L);
    }

    @Test
    public void Validate249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate249");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Class<?> wildcardClass5 = strComparableArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate250");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate251");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.validIndex(strArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate252");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate253");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.GenericDeclaration) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration4);
    }

    @Test
    public void Validate254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate254");
        java.lang.Object[][][] objArray0 = new java.lang.Object[][][] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.io.Serializable serializable7 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) charSequenceArray6);
        java.lang.Object[][][] objArray8 = org.apache.commons.lang3.Validate.noNullElements(objArray0, "hi!", (java.lang.Object[]) charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate255");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate256");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 'a');
    }

    @Test
    public void Validate257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate257");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type type4 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement5);
    }

    @Test
    public void Validate258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate258");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate259");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.io.Serializable[][] serializableArray8 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[][]) strComparableArray6);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate260");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence[][] charSequenceArray1 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void Validate261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate261");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.Validate.notBlank("", "hi!", (java.lang.Object[]) charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void Validate262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate262");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.noNullElements(typeArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate263");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notNull("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void Validate264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate264");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray5);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "", (java.lang.Object[]) charSequenceArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate265");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        java.lang.Comparable<java.lang.String>[][] strComparableArray9 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void Validate266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate266");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate267");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray0);
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) charSequenceArray0, "hi!", (java.lang.Object[]) strComparableArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate268");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern(charSequence0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate269");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.Type[][] typeArray9 = org.apache.commons.lang3.Validate.notEmpty(typeArray0, "", (java.lang.Object[]) strComparableArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate270");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String[] strArray1 = org.apache.commons.lang3.Validate.notEmpty(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate271");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate272");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate273");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.io.Serializable[][] serializableArray8 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[][]) strComparableArray6);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate274");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate275");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate276");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate277");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate278");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate279");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.Validate.notEmpty(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notNull(typeArray5);
        java.lang.Class<?> wildcardClass8 = typeArray7.getClass();
        java.lang.reflect.Type type9 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void Validate280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate280");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.Object[][][] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate281");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notEmpty(strArray5);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate282");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (byte) 0);
    }

    @Test
    public void Validate283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate283");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.notEmpty("", "", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate284");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray3 };
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray4);
        java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[]) charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate285");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) true, "", (java.lang.Object[]) typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + true + "'", serializable9.equals(true));
    }

    @Test
    public void Validate286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate286");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) charSequenceArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate287");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (short) 10);
    }

    @Test
    public void Validate288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate288");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate289");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate290");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        java.lang.Comparable<java.lang.String>[][] strComparableArray9 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void Validate291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate291");
        org.apache.commons.lang3.Validate.isTrue(true, "", 0.0d);
    }

    @Test
    public void Validate292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate292");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate293");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) ' ');
    }

    @Test
    public void Validate294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate294");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 10, "", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void Validate295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate295");
        java.io.Serializable[][] serializableArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.io.Serializable[][] serializableArray1 = org.apache.commons.lang3.Validate.notEmpty(serializableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate296");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("", "", (java.lang.Object[]) strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate297");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.notNull(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate298");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.Validate.notNull(wildcardClass4);
        java.lang.Object[] objArray7 = null;
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass5, "hi!", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement8);
    }

    @Test
    public void Validate299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate299");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence3 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate300");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[]) strComparableArray4);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate301");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate302");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate303");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void Validate304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate304");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate305");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate306");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate307");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "hi!", (java.lang.Object[]) strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate308");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate309");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate310");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
    }

    @Test
    public void Validate311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate311");
        java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void Validate312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate312");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (-1L));
    }

    @Test
    public void Validate313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate313");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "", "hi!", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate314");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate315");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.Validate.notBlank("", "", (java.lang.Object[]) charSequenceArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void Validate316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate316");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.notEmpty(annotatedElementArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate317");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate318");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate319");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.io.Serializable[][][] serializableArray8 = org.apache.commons.lang3.Validate.validIndex(serializableArray6, (int) (short) 1);
        java.lang.Object[][][] objArray9 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate320");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.validIndex("hi!", 10, "hi!", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate321");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray6);
        java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate322");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type type4 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.Type) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate323");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank(charSequence0, "hi!", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: hi!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void Validate324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate324");
        java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void Validate325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate325");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate326");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.Validate.notEmpty(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notNull(typeArray5);
        java.lang.Class<?> wildcardClass8 = typeArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate327");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) charSequenceArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate328");
        org.apache.commons.lang3.Validate.isTrue(true, "", 10L);
    }

    @Test
    public void Validate329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate329");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.Validate.notNull(wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericDeclaration6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate330");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray3 };
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray4);
        java.lang.Class<?> wildcardClass8 = charSequenceArray4.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement9 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement9);
    }

    @Test
    public void Validate331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate331");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (java.lang.Object[]) charSequenceArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void Validate332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate332");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Object[][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) 100, "hi!", (java.lang.Object[]) objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate333");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            java.io.Serializable[][] serializableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][]) strComparableArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate334");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[]) serializableArray6, 0);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate335");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate336");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray2);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray2, "hi!", objArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notNull(strArray2);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void Validate337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate337");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate338");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate339");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] { typeArray0 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.Type[][] typeArray7 = org.apache.commons.lang3.Validate.validIndex(typeArray1, (int) 'a', "hi!", (java.lang.Object[]) annotatedElementArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray6);
    }

    @Test
    public void Validate340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate340");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.Validate.notBlank("", "", (java.lang.Object[]) annotatedElementArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
    }

    @Test
    public void Validate341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate341");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate342");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (-1.0d));
    }

    @Test
    public void Validate343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate343");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.io.Serializable[] serializableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[]) strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate344");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "hi!", (java.lang.Object[]) strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate345");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) -1);
    }

    @Test
    public void Validate346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate346");
        java.lang.Object[] objArray2 = null;
        org.apache.commons.lang3.Validate.validState(true, "hi!", objArray2);
    }

    @Test
    public void Validate347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate347");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("", "hi!", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void Validate348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate348");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate349");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.io.Serializable serializable7 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) charSequenceArray6);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void Validate350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate350");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][][] objArray4 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][][]) strComparableArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void Validate351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate351");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericDeclaration6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate352");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate353");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("", "hi!", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate354");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.noNullElements(typeArray6);
        java.lang.String str9 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate355");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.io.Serializable[][] serializableArray8 = org.apache.commons.lang3.Validate.validIndex((java.io.Serializable[][]) objArray1, (int) (short) 10, "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate356");
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray5 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray6 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray7 = new java.io.Serializable[][][] { serializableArray2, serializableArray3, serializableArray4, serializableArray5, serializableArray6 };
        java.io.Serializable[][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements(serializableArray7);
        java.lang.String str9 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate357");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate358");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        // The following exception was thrown during execution in Validate generation
        try {
            java.io.Serializable[][][][] serializableArray2 = org.apache.commons.lang3.Validate.validIndex(serializableArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
    }

    @Test
    public void Validate359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate359");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate360");
        org.apache.commons.lang3.Validate.isTrue(true, "", 100L);
    }

    @Test
    public void Validate361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate361");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate362");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray2);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.Class<?> wildcardClass6 = charSequenceArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Validate363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate363");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate364");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate365");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (short) 100);
    }

    @Test
    public void Validate366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate366");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray4);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray4);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate367");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.io.Serializable[][][] serializableArray7 = org.apache.commons.lang3.Validate.notNull(serializableArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[] objArray9 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[]) serializableArray7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate368");
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate369");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        java.lang.Object[][][][] objArray2 = org.apache.commons.lang3.Validate.notNull(objArray1);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][][] objArray3 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][][]) objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void Validate370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate370");
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate371");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate372");
        java.lang.Object[][][][] objArray3 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements(objArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Validate.validIndex("", 0, "hi!", (java.lang.Object[]) objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void Validate373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate373");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][][][] objArray3 = org.apache.commons.lang3.Validate.validIndex(objArray1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void Validate374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate374");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Object[][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][][] objArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][][]) strComparableArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void Validate375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate375");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate[] validateArray2 = org.apache.commons.lang3.Validate.notEmpty(validateArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
    }

    @Test
    public void Validate376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate376");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) -1, "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate377");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern(charSequence0, "hi!", "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate378");
        java.lang.reflect.Type[] typeArray0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.validIndex("hi!", 1, "", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.Type[] typeArray9 = org.apache.commons.lang3.Validate.notEmpty(typeArray0, "hi!", (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: hi!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate379");
        java.lang.Object[] objArray3 = null;
        java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 1, "", objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void Validate380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate380");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate381");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) '#');
    }

    @Test
    public void Validate382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate382");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        org.apache.commons.lang3.Validate validate1 = org.apache.commons.lang3.Validate.notNull(validate0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate1);
    }

    @Test
    public void Validate383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate383");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate384");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate385");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (byte) -1);
    }

    @Test
    public void Validate386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate386");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 100L);
    }

    @Test
    public void Validate387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate387");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 100.0d);
    }

    @Test
    public void Validate388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate388");
        org.apache.commons.lang3.Validate.isTrue(true, "", 1.0d);
    }

    @Test
    public void Validate389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate389");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate390");
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) charSequenceArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) '4', "", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void Validate391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate391");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 1);
    }

    @Test
    public void Validate392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate392");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 10.0d);
    }

    @Test
    public void Validate393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate393");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate394");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate395");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate396");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate397");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.Validate.notEmpty(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notNull(typeArray5);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate398");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][][] objArray6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][][]) strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate399");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        java.lang.String str9 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate400");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.io.Serializable[][][] serializableArray8 = org.apache.commons.lang3.Validate.validIndex(serializableArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate401");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate402");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray7);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "", (java.lang.Object[]) charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate403");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate404");
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray5);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.validIndex("", (int) (byte) 100, "", (java.lang.Object[]) charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate405");
        java.lang.Object[][][][] objArray6 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) objArray6);
        org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate406");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate407");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate[] validateArray2 = org.apache.commons.lang3.Validate.notEmpty(validateArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
    }

    @Test
    public void Validate408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate408");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[]) strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
    }

    @Test
    public void Validate409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate409");
        org.apache.commons.lang3.Validate[] validateArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate410");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "", (java.lang.Object[]) strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void Validate411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate411");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "hi!", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate412");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 100L);
    }

    @Test
    public void Validate413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate413");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "", (java.lang.Object[]) strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate414");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) charSequenceArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceArray6.getClass();
        java.io.Serializable serializable9 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void Validate415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate415");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate416");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "" + "'", charSequence1.equals(""));
    }

    @Test
    public void Validate417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate417");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray1);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.notEmpty(annotatedElementArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
    }

    @Test
    public void Validate418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate418");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.Validate.notNull(strArray1);
        java.lang.Object[] objArray5 = null;
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray1, "", objArray5);
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate419");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) 1);
    }

    @Test
    public void Validate420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate420");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate421");
        org.apache.commons.lang3.Validate validate2 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate5 = org.apache.commons.lang3.Validate.notNull(validate2, "hi!", objArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate5);
    }

    @Test
    public void Validate422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate422");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][][][] strComparableArray5 = org.apache.commons.lang3.Validate.validIndex(strComparableArray3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void Validate423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate423");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray1);
        java.lang.Class<?> wildcardClass3 = annotatedElementArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Validate424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate424");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate425");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.lang.Class<?> wildcardClass4 = strComparableArray3.getClass();
        java.lang.Object obj5 = org.apache.commons.lang3.Validate.notNull((java.lang.Object) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "class [Ljava.lang.String;");
    }

    @Test
    public void Validate426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate426");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence[][] charSequenceArray1 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate427");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.Class<?> wildcardClass6 = typeArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Validate428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate428");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate429");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate430");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray2 = new java.lang.CharSequence[][][] { charSequenceArray0, charSequenceArray1 };
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence[][][] charSequenceArray4 = org.apache.commons.lang3.Validate.validIndex(charSequenceArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
    }

    @Test
    public void Validate431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate431");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        org.apache.commons.lang3.Validate[] validateArray5 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray6);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) validateArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.Validate.noNullElements(wildcardClassArray0, "hi!", (java.lang.Object[]) validateArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
    }

    @Test
    public void Validate432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate432");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray0, strArray1 };
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String[][] strArray4 = org.apache.commons.lang3.Validate.validIndex(strArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void Validate433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate433");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate434");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate435");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.lang3.Validate[] validateArray5 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) validateArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern(charSequence0, "", "hi!", (java.lang.Object[]) validateArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
    }

    @Test
    public void Validate436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate436");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate437");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate438");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray3 };
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.validIndex(charSequenceArray4, (int) (short) 0);
        java.lang.CharSequence[][] charSequenceArray9 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void Validate439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate439");
        org.apache.commons.lang3.Validate[] validateArray2 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) validateArray3);
        java.lang.Class<?> wildcardClass5 = validateArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate440");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate441");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray7);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate442");
        org.apache.commons.lang3.Validate[] validateArray4 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) validateArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
    }

    @Test
    public void Validate443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate443");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) strArray3);
        java.lang.CharSequence[] charSequenceArray9 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void Validate444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate444");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate445");
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray5 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray6 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray7 = new java.io.Serializable[][][] { serializableArray2, serializableArray3, serializableArray4, serializableArray5, serializableArray6 };
        java.io.Serializable[][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements(serializableArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) serializableArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate446");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void Validate447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate447");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) annotatedElementArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
    }

    @Test
    public void Validate448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate448");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] { wildcardClass6 };
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.validIndex("", (int) '4', "", (java.lang.Object[]) typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate449");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        java.lang.Class<?> wildcardClass2 = validateArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Validate450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate450");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray4);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][]) strComparableArray4);
        java.lang.Class<?> wildcardClass8 = serializableArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate451");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
    }

    @Test
    public void Validate452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate452");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[]) strComparableArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate453");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.lang.Object[] objArray8 = null;
        java.io.Serializable[][][] serializableArray9 = org.apache.commons.lang3.Validate.notNull(serializableArray5, "hi!", objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray9);
    }

    @Test
    public void Validate454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate454");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][] objArray5 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][]) strComparableArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void Validate455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate455");
        org.apache.commons.lang3.Validate validate2 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate5 = org.apache.commons.lang3.Validate.notNull(validate2, "hi!", objArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", objArray4);
        java.lang.Class<?> wildcardClass7 = objArray4.getClass();
        java.lang.reflect.Type type8 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void Validate456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate456");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][][] objArray6 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][][]) strComparableArray4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void Validate457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate457");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][]) serializableArray6);
        java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[]) serializableArray7);
        java.io.Serializable[][] serializableArray9 = org.apache.commons.lang3.Validate.notEmpty(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray9);
    }

    @Test
    public void Validate458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate458");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Object[][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray4);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) strComparableArray4);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][]) strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate459");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence3 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate460");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray2);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray2, "hi!", objArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notNull(strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.Validate.notEmpty(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void Validate461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate461");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.io.Serializable[] serializableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[]) strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[]) serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate462");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notEmpty(strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void Validate463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate463");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate464");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) charSequenceArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate465");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.Validate.notEmpty("", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate466");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.notEmpty(objArray0, "hi!", (java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: hi!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void Validate467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate467");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        java.lang.Object[][][][] objArray2 = org.apache.commons.lang3.Validate.notNull(objArray1);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Object[][] objArray3 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void Validate468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate468");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate469");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate470");
        org.apache.commons.lang3.Validate[] validateArray3 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray4 = org.apache.commons.lang3.Validate.noNullElements(validateArray3);
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) validateArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate[] validateArray8 = org.apache.commons.lang3.Validate.validIndex(validateArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
    }

    @Test
    public void Validate471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate471");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.notNull(annotatedElementArray1);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.notEmpty(annotatedElementArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
    }

    @Test
    public void Validate472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate472");
        java.lang.Object[][][][] objArray5 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements(objArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) objArray5);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void Validate473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate473");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.io.Serializable[][] serializableArray8 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[][]) strComparableArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate474");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate475");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void Validate476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate476");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.Validate.notEmpty(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void Validate477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate477");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Object[][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray2);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.validIndex(strComparableArray2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void Validate478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate478");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.Validate.notNull(wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = genericDeclaration6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate479");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate480");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray2 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0, "", objArray2);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = org.apache.commons.lang3.Validate.notNull(genericDeclarationArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
    }

    @Test
    public void Validate481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate481");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated character sequence is blank");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate482");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate483");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", strComparable2, "hi!", (java.lang.Object[]) annotatedElementArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray6);
    }

    @Test
    public void Validate484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate484");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) annotatedElementArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
    }

    @Test
    public void Validate485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate485");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.Comparable<java.lang.String> strComparable8 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) charSequenceArray7);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void Validate486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate486");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (byte) 1);
    }

    @Test
    public void Validate487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate487");
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate488");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void Validate489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate489");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray4);
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate490");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate491");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 10);
    }

    @Test
    public void Validate492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate492");
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate493");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in Validate generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate494");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.notNull(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate495");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (short) 10);
    }

    @Test
    public void Validate496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate496");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray7);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "", (java.lang.Object[]) charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate497");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.Validate.notNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void Validate498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate498");
        java.lang.Comparable[][][][] comparableArray3 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in Validate generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("", "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate499");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.io.Serializable serializable7 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) strArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void Validate500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.Validate500");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) '#');
    }
}

