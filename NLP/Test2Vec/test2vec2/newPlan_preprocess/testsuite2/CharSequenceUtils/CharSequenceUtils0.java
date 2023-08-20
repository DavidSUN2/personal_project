package CharSequenceUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSequenceUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test01");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test02");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test03");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test04");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test05");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test07");
        org.apache.commons.lang3.CharSequenceUtils charSequenceUtils0 = new org.apache.commons.lang3.CharSequenceUtils();
        java.lang.Class<?> wildcardClass1 = charSequenceUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test08");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test09");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test10");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test11");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test12");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test13");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test14");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test15");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test16");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test17");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test18");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test19");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test20");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test21");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -94");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test22");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test23");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test24");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -30");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test25");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test26");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test27");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test28");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test29");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test30");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test31");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test32");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test33");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test34");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test35");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test36");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test37");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test38");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test39");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test40");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test41");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test42");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test43");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test44");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test45");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test46");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test47");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test48");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test49");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test50");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test51");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test52");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test53");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test54");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test55");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test56");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test57");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test58");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test59");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test60");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test61");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test62");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -29");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test63");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test64");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test65");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test66");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test67");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test68");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test69");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test70");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test71");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test72");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test73");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -51");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test74");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test75");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test76");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test77");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -31");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test78");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test79");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -95");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test80");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test81");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test82");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test83");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test84");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test85");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test86");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test87");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test88");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test89");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test90");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test91");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test92");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test93");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test94");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test95");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test96");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.test97");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }
}

