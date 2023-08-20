
package Validate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Validate0 {

    public static boolean debug = false;

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified inclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test003");
        java.lang.Object[] objArray2 = null;
        org.apache.commons.lang3.Validate.validState(true, "", objArray2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified inclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test005");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 0L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The validated state is false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.Validate.notBlank("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is blank");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test010");
        java.lang.Object obj1 = org.apache.commons.lang3.Validate.notNull((java.lang.Object) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj1 + "' != '" + (-1L) + "'", obj1.equals((-1L)));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test011");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test012");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test013");
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!");
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test014");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test015");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test016");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test018");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test019");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "" + "'", strComparable1.equals(""));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test020");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test021");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test022");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray2 = org.apache.commons.lang3.Validate.validIndex(objArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test023");
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "");
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test024");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test027");
        org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test028");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test029");
        org.apache.commons.lang3.Validate.isTrue(true);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test031");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test032");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test033");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test034");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test035");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notBlank("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test036");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test037");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (byte) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified inclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test039");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test040");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test041");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test042");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is blank");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test044");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) '4');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test045");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified inclusive range of hi! to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test049");
        org.apache.commons.lang3.Validate.validState(true);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test051");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test052");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test053");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test054");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test055");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of  to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test057");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test059");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test060");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test061");
        java.lang.Comparable<java.lang.String>[][] strComparableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][] strComparableArray1 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The string  does not match the pattern hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test063");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notEmpty("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test064");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test065");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 'a');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test066");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test067");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test068");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test069");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 10.0f);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test071");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test072");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 0.0d);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test074");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test076");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test077");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.notNull(strArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test078");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test079");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of hi! to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test081");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test082");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test083");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.notNull(strArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test085");
        org.apache.commons.lang3.Validate validate2 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate5 = org.apache.commons.lang3.Validate.notNull(validate2, "hi!", objArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test087");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test088");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test089");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test090");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] { wildcardClass6 };
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test093");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (-1.0f));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test094");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test095");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test096");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test097");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test098");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The string hi! does not match the pattern ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test099");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test100");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test101");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (byte) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test102");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test103");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.Validate.notEmpty("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated character sequence is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test106");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test107");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) ' ');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test109");
        java.lang.Comparable<java.lang.String>[][][] strComparableArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test110");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test111");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.notNull(strArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test112");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test113");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test114");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (byte) -1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test115");
        java.lang.Object[] objArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.Validate.notBlank("hi!", "", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test116");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        org.apache.commons.lang3.Validate[] validateArray1 = new org.apache.commons.lang3.Validate[] { validate0 };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notNull(strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test117");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test118");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test119");
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test120");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of  to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test121");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test122");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test123");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test124");
        org.apache.commons.lang3.Validate.isTrue(true, "", 10.0d);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test125");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test126");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test127");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test129");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test130");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test131");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.Validate.notBlank("", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test132");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (-1));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test133");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test134");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test135");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test136");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) '4');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test138");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test139");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value  is not in the specified exclusive range of  to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test141");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test143");
        java.lang.Object[] objArray2 = null;
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", objArray2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test145");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test146");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.notNull(strComparableArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test147");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test148");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notNull(strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test149");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test151");
        java.lang.CharSequence[][][] charSequenceArray0 = new java.lang.CharSequence[][][] {};
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test152");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test153");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test154");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of hi! to hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test156");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test158");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test159");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test161");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test162");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.notNull(strArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test163");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test164");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test167");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test168");
        java.lang.Object[][][] objArray0 = null;
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test169");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 100L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test170");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test172");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test173");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.notNull(strArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test174");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test176");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test177");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test178");
        java.lang.Object[] objArray2 = null;
        java.lang.Comparable<java.lang.String> strComparable3 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "hi!", "", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable3 + "' != '" + "hi!" + "'", strComparable3.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test179");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test180");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test181");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test182");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test183");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test184");
        java.lang.Comparable<java.lang.String>[][][] strComparableArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test185");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test186");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) '#');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test187");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test188");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test189");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test190");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test191");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (byte) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test193");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test194");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test195");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test196");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test197");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test198");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test199");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test200");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) 0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test201");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test202");
        java.lang.reflect.Type[][] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][] typeArray2 = org.apache.commons.lang3.Validate.validIndex(typeArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test203");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test204");
        java.lang.Object[] objArray3 = null;
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "", objArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test206");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test207");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 1.0f);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test208");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test209");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test210");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test213");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) ' ');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test214");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test215");
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test216");
        java.lang.Object[] objArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test217");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.io.Serializable[][] serializableArray6 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[][]) strComparableArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test218");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test219");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test220");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test221");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test222");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test223");
        org.apache.commons.lang3.Validate.isTrue(true, "", 0L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test224");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test225");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notNull("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test226");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test227");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test228");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test230");
        java.lang.Object[] objArray3 = null;
        java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 1, "hi!", objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test232");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 100.0f);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test233");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test234");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notEmpty(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated character sequence is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test235");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test236");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test237");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test238");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test239");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test240");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test241");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test242");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test243");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test244");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test245");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test246");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test247");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test248");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 10L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test249");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test250");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test251");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.validIndex(strArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test252");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test253");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test254");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test256");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) 'a');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test257");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test258");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test259");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test260");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test261");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test262");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.noNullElements(typeArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test263");
        java.lang.String str1 = org.apache.commons.lang3.Validate.notNull("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test264");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test265");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test266");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test267");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray0);
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test268");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test269");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test270");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.commons.lang3.Validate.notEmpty(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test272");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test273");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test274");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test275");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test276");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test279");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test280");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.Object[][][] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test281");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test282");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (byte) 0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test283");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test284");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test285");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test286");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test287");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (short) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test289");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test290");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test291");
        org.apache.commons.lang3.Validate.isTrue(true, "", 0.0d);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value hi! is not in the specified exclusive range of hi! to ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test293");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) ' ');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test294");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test295");
        java.io.Serializable[][] serializableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][] serializableArray1 = org.apache.commons.lang3.Validate.notEmpty(serializableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test296");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test297");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test298");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test299");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence3 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test300");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test301");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test303");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test304");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex(charSequence0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test305");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test306");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test307");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test309");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test310");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "", objArray6);
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
        org.junit.Assert.assertNotNull(validate7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test311");
        java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test312");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (-1L));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test313");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test314");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test315");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test316");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.notEmpty(annotatedElementArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test319");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test320");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test321");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test322");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test323");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test324");
        java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test325");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test326");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test327");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test328");
        org.apache.commons.lang3.Validate.isTrue(true, "", 10L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test329");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test330");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test331");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test332");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Object[][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test333");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test334");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test335");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test336");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test339");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] { typeArray0 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test340");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test341");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test342");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (-1.0d));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test343");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test344");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test345");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) -1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test346");
        java.lang.Object[] objArray2 = null;
        org.apache.commons.lang3.Validate.validState(true, "hi!", objArray2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test347");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test348");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test349");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test350");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test351");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test352");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test353");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test354");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test355");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test356");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test357");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test358");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test359");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test360");
        org.apache.commons.lang3.Validate.isTrue(true, "", 100L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test362");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test364");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test365");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (short) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test366");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test367");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.io.Serializable[][][] serializableArray7 = org.apache.commons.lang3.Validate.notNull(serializableArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test368");
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 10, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test369");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        java.lang.Object[][][][] objArray2 = org.apache.commons.lang3.Validate.notNull(objArray1);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test370");
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test372");
        java.lang.Object[][][][] objArray3 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements(objArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test373");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test374");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Object[][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test375");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test376");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test377");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern(charSequence0, "hi!", "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test378");
        java.lang.reflect.Type[] typeArray0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.validIndex("hi!", 1, "", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test379");
        java.lang.Object[] objArray3 = null;
        java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 1, "", objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test381");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) '#');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test382");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        org.apache.commons.lang3.Validate validate1 = org.apache.commons.lang3.Validate.notNull(validate0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test385");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (byte) -1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test386");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 100L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test387");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 100.0d);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test388");
        org.apache.commons.lang3.Validate.isTrue(true, "", 1.0d);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test390");
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) charSequenceArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test391");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test392");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 10.0d);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test395");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test397");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test398");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test399");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test400");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test401");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test402");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test403");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test404");
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray5);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test405");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test406");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test407");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test408");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test409");
        org.apache.commons.lang3.Validate[] validateArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test410");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.io.Serializable serializable6 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test411");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test412");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 100L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test413");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test414");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test416");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "" + "'", charSequence1.equals(""));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test417");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray1);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test418");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test419");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test420");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test421");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test422");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test423");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test424");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test425");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test426");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray1 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test427");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test429");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test430");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray2 = new java.lang.CharSequence[][][] { charSequenceArray0, charSequenceArray1 };
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test431");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        org.apache.commons.lang3.Validate[] validateArray5 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray6);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) validateArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test432");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray0, strArray1 };
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test433");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test435");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.lang3.Validate[] validateArray5 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) validateArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test436");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test438");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test439");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test440");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test441");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test442");
        org.apache.commons.lang3.Validate[] validateArray4 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test443");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test444");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test445");
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray5 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray6 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray7 = new java.io.Serializable[][][] { serializableArray2, serializableArray3, serializableArray4, serializableArray5, serializableArray6 };
        java.io.Serializable[][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements(serializableArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test446");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test447");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test448");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] { wildcardClass6 };
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test449");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test450");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test451");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test452");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test453");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test454");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test455");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test456");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test457");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test458");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test459");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence3 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test460");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test461");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test462");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notEmpty(strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test463");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test464");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test465");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.Validate.notEmpty("", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test466");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test467");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        java.lang.Object[][][][] objArray2 = org.apache.commons.lang3.Validate.notNull(objArray1);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test468");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test469");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test470");
        org.apache.commons.lang3.Validate[] validateArray3 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray4 = org.apache.commons.lang3.Validate.noNullElements(validateArray3);
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) validateArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test471");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.notNull(annotatedElementArray1);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test472");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test473");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test474");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test475");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test476");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test477");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Object[][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray2);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test478");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test479");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test480");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray2 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0, "", objArray2);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = org.apache.commons.lang3.Validate.notNull(genericDeclarationArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test481");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.apache.commons.lang3.Validate.notBlank(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated character sequence is blank");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test482");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test483");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test484");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test485");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.Comparable<java.lang.String> strComparable8 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) charSequenceArray7);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test486");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (byte) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test487");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test488");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test489");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray4);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test490");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test491");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test492");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test493");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test494");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test495");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (short) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test496");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test497");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test498");
        java.lang.Comparable[][][][] comparableArray3 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray6 = org.apache.commons.lang3.Validate.notNull(strComparableArray5);
        // The following exception was thrown during execution in test generation
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test499");
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate0.test500");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) '#');
    }
}

