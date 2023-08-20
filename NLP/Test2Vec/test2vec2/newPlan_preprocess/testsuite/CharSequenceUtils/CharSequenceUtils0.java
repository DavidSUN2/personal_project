package CharSequenceUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSequenceUtils0 {

    public static boolean debug = false;

    @Test
    public void CharSequenceUtils01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils01");
        org.apache.commons.lang3.CharSequenceUtils charSequenceUtils0 = new org.apache.commons.lang3.CharSequenceUtils();
        java.lang.Class<?> wildcardClass1 = charSequenceUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSequenceUtils02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils02");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void CharSequenceUtils03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils03");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void CharSequenceUtils04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils04");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils05");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils06");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -94");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils07");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils08");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils09");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils10");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSequenceUtils12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils12");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils13");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void CharSequenceUtils14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils14");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils15");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -29");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils16");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils17");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils18");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void CharSequenceUtils19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils19");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -31");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils20");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void CharSequenceUtils21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils21");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils22");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils23");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils24");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils25");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils26");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils27");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void CharSequenceUtils28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils28");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils29");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils30");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void CharSequenceUtils31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils31");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void CharSequenceUtils32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils32");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils33");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void CharSequenceUtils34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils34");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils35");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void CharSequenceUtils36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils36");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils37");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils38");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils39");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils40");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils41");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -30");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils42");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -95");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils43");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils44");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils45");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void CharSequenceUtils46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils46");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void CharSequenceUtils47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils47");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils48");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils49");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void CharSequenceUtils50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils50");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils51");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils52");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils53");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils54");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils55");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void CharSequenceUtils56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils56");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void CharSequenceUtils57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils57");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils58");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils59");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void CharSequenceUtils60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils60");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils61");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils62");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils63");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils64");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils65");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "i!" + "'", charSequence2.equals("i!"));
    }

    @Test
    public void CharSequenceUtils66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils66");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "!" + "'", charSequence2.equals("!"));
    }

    @Test
    public void CharSequenceUtils67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils67");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils68");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void CharSequenceUtils69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils69");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils70");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils71");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils72");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils73");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void CharSequenceUtils74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils74");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils75");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils76");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils77");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils78");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils79");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils80");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "i!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils81");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils82");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils83");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
    }

    @Test
    public void CharSequenceUtils84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils84");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils85");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils86");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils87");
        // The following exception was thrown during execution in CharSequenceUtils generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence((java.lang.CharSequence) "!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -51");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void CharSequenceUtils88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils88");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils89");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils90");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils91");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils92");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils93");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils94");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils95");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils96");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void CharSequenceUtils97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSequenceUtils0.CharSequenceUtils97");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.CharSequenceUtils.subSequence(charSequence0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }
}

