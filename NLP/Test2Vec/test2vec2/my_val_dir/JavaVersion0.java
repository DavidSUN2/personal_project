
package JavaVersion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JavaVersion0 {

    public static boolean debug = false;

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test01");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        java.lang.String str1 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.8" + "'", str1.equals("1.8"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test02");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion1.toString();
        java.lang.String str4 = javaVersion1.toString();
        org.apache.commons.lang3.JavaVersion javaVersion5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = javaVersion1.atLeast(javaVersion5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.6" + "'", str3.equals("1.6"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.6" + "'", str4.equals("1.6"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test03");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean4 = javaVersion1.atLeast(javaVersion3);
        java.lang.String str5 = javaVersion1.toString();
        java.lang.String str6 = javaVersion1.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.3" + "'", str5.equals("1.3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.3" + "'", str6.equals("1.3"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test04");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test05");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion2 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean3 = javaVersion1.atLeast(javaVersion2);
        boolean boolean4 = javaVersion0.atLeast(javaVersion2);
        java.lang.String str5 = javaVersion2.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion2 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion2.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.9" + "'", str5.equals("0.9"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test06");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean4 = javaVersion1.atLeast(javaVersion3);
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_5;
        java.lang.String str6 = javaVersion5.toString();
        boolean boolean7 = javaVersion3.atLeast(javaVersion5);
        org.apache.commons.lang3.JavaVersion javaVersion8 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean9 = javaVersion3.atLeast(javaVersion8);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_5 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.5" + "'", str6.equals("1.5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + javaVersion8 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion8.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test07");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean6 = javaVersion4.atLeast(javaVersion5);
        boolean boolean7 = javaVersion3.atLeast(javaVersion5);
        boolean boolean8 = javaVersion0.atLeast(javaVersion3);
        java.lang.String str9 = javaVersion3.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.9" + "'", str9.equals("0.9"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test08");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean5 = javaVersion0.atLeast(javaVersion4);
        java.lang.String str6 = javaVersion4.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.4" + "'", str3.equals("1.4"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.1" + "'", str6.equals("1.1"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test09");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_2;
        java.lang.String str1 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_2 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.2" + "'", str1.equals("1.2"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test10");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion2 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean3 = javaVersion1.atLeast(javaVersion2);
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean5 = javaVersion2.atLeast(javaVersion4);
        boolean boolean6 = javaVersion0.atLeast(javaVersion2);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion2 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion2.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test11");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_5;
        java.lang.String str1 = javaVersion0.toString();
        java.lang.String str2 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_5 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.5" + "'", str1.equals("1.5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.5" + "'", str2.equals("1.5"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test12");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean5 = javaVersion3.atLeast(javaVersion4);
        java.lang.String str6 = javaVersion3.toString();
        boolean boolean7 = javaVersion0.atLeast(javaVersion3);
        java.lang.String str8 = javaVersion0.toString();
        java.lang.String str9 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.4" + "'", str6.equals("1.4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.4" + "'", str8.equals("1.4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.4" + "'", str9.equals("1.4"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test13");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.4" + "'", str3.equals("1.4"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test14");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        java.lang.String str1 = javaVersion0.toString();
        java.lang.String str2 = javaVersion0.toString();
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        boolean boolean6 = javaVersion4.atLeast(javaVersion5);
        boolean boolean7 = javaVersion0.atLeast(javaVersion4);
        java.lang.String str8 = javaVersion4.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.1" + "'", str1.equals("1.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.1" + "'", str2.equals("1.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.1" + "'", str3.equals("1.1"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.1" + "'", str8.equals("1.1"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test15");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion1.toString();
        java.lang.String str4 = javaVersion1.toString();
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion6 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean7 = javaVersion5.atLeast(javaVersion6);
        java.lang.String str8 = javaVersion6.toString();
        boolean boolean9 = javaVersion1.atLeast(javaVersion6);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.3" + "'", str3.equals("1.3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.3" + "'", str4.equals("1.3"));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion6 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion6.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.1" + "'", str8.equals("1.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test16");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean4 = javaVersion1.atLeast(javaVersion3);
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_5;
        java.lang.String str6 = javaVersion5.toString();
        boolean boolean7 = javaVersion3.atLeast(javaVersion5);
        java.lang.String str8 = javaVersion3.toString();
        java.lang.String str9 = javaVersion3.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_5 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.5" + "'", str6.equals("1.5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.8" + "'", str8.equals("1.8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.8" + "'", str9.equals("1.8"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test17");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean4 = javaVersion1.atLeast(javaVersion3);
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_5;
        java.lang.String str6 = javaVersion5.toString();
        boolean boolean7 = javaVersion3.atLeast(javaVersion5);
        java.lang.String str8 = javaVersion5.toString();
        java.lang.String str9 = javaVersion5.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_5 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.5" + "'", str6.equals("1.5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.5" + "'", str8.equals("1.5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.5" + "'", str9.equals("1.5"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test18");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion1.toString();
        java.lang.String str4 = javaVersion1.toString();
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        java.lang.String str6 = javaVersion5.toString();
        boolean boolean7 = javaVersion1.atLeast(javaVersion5);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.3" + "'", str3.equals("1.3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.3" + "'", str4.equals("1.3"));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.9" + "'", str6.equals("0.9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test19");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion1.toString();
        java.lang.String str4 = javaVersion1.toString();
        java.lang.String str5 = javaVersion1.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.6" + "'", str3.equals("1.6"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.6" + "'", str4.equals("1.6"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.6" + "'", str5.equals("1.6"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test20");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion2 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean3 = javaVersion1.atLeast(javaVersion2);
        boolean boolean4 = javaVersion0.atLeast(javaVersion2);
        org.apache.commons.lang3.JavaVersion javaVersion5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = javaVersion0.atLeast(javaVersion5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion2 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion2.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test21");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        java.lang.String str1 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion2 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        boolean boolean4 = javaVersion2.atLeast(javaVersion3);
        boolean boolean5 = javaVersion0.atLeast(javaVersion2);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.3" + "'", str1.equals("1.3"));
        org.junit.Assert.assertTrue("'" + javaVersion2 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion2.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test22");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        java.lang.String str4 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.1" + "'", str3.equals("1.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.1" + "'", str4.equals("1.1"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test23");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        java.lang.String str1 = javaVersion0.toString();
        java.lang.String str2 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.9" + "'", str1.equals("0.9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.9" + "'", str2.equals("0.9"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test24");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean6 = javaVersion4.atLeast(javaVersion5);
        boolean boolean7 = javaVersion3.atLeast(javaVersion5);
        boolean boolean8 = javaVersion0.atLeast(javaVersion5);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test25");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion2 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean3 = javaVersion1.atLeast(javaVersion2);
        boolean boolean4 = javaVersion0.atLeast(javaVersion2);
        java.lang.String str5 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion2 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion2.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.9" + "'", str5.equals("0.9"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test26");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean5 = javaVersion0.atLeast(javaVersion4);
        org.apache.commons.lang3.JavaVersion javaVersion6 = org.apache.commons.lang3.JavaVersion.JAVA_1_7;
        boolean boolean7 = javaVersion4.atLeast(javaVersion6);
        java.lang.String str8 = javaVersion4.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.4" + "'", str3.equals("1.4"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + javaVersion6 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_7 + "'", javaVersion6.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_7));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.1" + "'", str8.equals("1.1"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test27");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean5 = javaVersion3.atLeast(javaVersion4);
        java.lang.String str6 = javaVersion3.toString();
        boolean boolean7 = javaVersion0.atLeast(javaVersion3);
        java.lang.String str8 = javaVersion3.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.4" + "'", str6.equals("1.4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.4" + "'", str8.equals("1.4"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test28");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        java.lang.String str1 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.6" + "'", str1.equals("1.6"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test29");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        java.lang.String str1 = javaVersion0.toString();
        java.lang.String str2 = javaVersion0.toString();
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean6 = javaVersion4.atLeast(javaVersion5);
        org.apache.commons.lang3.JavaVersion javaVersion7 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean8 = javaVersion5.atLeast(javaVersion7);
        boolean boolean9 = javaVersion0.atLeast(javaVersion5);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.1" + "'", str1.equals("1.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.1" + "'", str2.equals("1.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.1" + "'", str3.equals("1.1"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + javaVersion7 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion7.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test30");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion1.toString();
        java.lang.String str4 = javaVersion1.toString();
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_2;
        boolean boolean6 = javaVersion1.atLeast(javaVersion5);
        java.lang.String str7 = javaVersion5.toString();
        java.lang.String str8 = javaVersion5.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.6" + "'", str3.equals("1.6"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.6" + "'", str4.equals("1.6"));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_2 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.2" + "'", str7.equals("1.2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.2" + "'", str8.equals("1.2"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test31");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_2;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion2 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean3 = javaVersion1.atLeast(javaVersion2);
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_8;
        boolean boolean5 = javaVersion2.atLeast(javaVersion4);
        boolean boolean6 = javaVersion0.atLeast(javaVersion4);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_2 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_2));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion2 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion2.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_8 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test32");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        org.apache.commons.lang3.JavaVersion javaVersion3 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean6 = javaVersion4.atLeast(javaVersion5);
        boolean boolean7 = javaVersion3.atLeast(javaVersion5);
        boolean boolean8 = javaVersion0.atLeast(javaVersion3);
        java.lang.String str9 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + javaVersion3 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion3.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.3" + "'", str9.equals("1.3"));
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test33");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean6 = javaVersion4.atLeast(javaVersion5);
        boolean boolean7 = javaVersion0.atLeast(javaVersion4);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.4" + "'", str3.equals("1.4"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test34");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean5 = javaVersion0.atLeast(javaVersion4);
        org.apache.commons.lang3.JavaVersion javaVersion6 = org.apache.commons.lang3.JavaVersion.JAVA_1_7;
        boolean boolean7 = javaVersion4.atLeast(javaVersion6);
        org.apache.commons.lang3.JavaVersion javaVersion8 = org.apache.commons.lang3.JavaVersion.JAVA_1_2;
        boolean boolean9 = javaVersion6.atLeast(javaVersion8);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.4" + "'", str3.equals("1.4"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + javaVersion6 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_7 + "'", javaVersion6.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_7));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + javaVersion8 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_2 + "'", javaVersion8.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test35");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_1_6;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        org.apache.commons.lang3.JavaVersion javaVersion5 = org.apache.commons.lang3.JavaVersion.JAVA_1_3;
        boolean boolean6 = javaVersion4.atLeast(javaVersion5);
        java.lang.String str7 = javaVersion5.toString();
        boolean boolean8 = javaVersion0.atLeast(javaVersion5);
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_6 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.1" + "'", str3.equals("1.1"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        org.junit.Assert.assertTrue("'" + javaVersion5 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_3 + "'", javaVersion5.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.3" + "'", str7.equals("1.3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void JavaVersion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JavaVersion0.test36");
        org.apache.commons.lang3.JavaVersion javaVersion0 = org.apache.commons.lang3.JavaVersion.JAVA_1_4;
        org.apache.commons.lang3.JavaVersion javaVersion1 = org.apache.commons.lang3.JavaVersion.JAVA_0_9;
        boolean boolean2 = javaVersion0.atLeast(javaVersion1);
        java.lang.String str3 = javaVersion0.toString();
        org.apache.commons.lang3.JavaVersion javaVersion4 = org.apache.commons.lang3.JavaVersion.JAVA_1_1;
        boolean boolean5 = javaVersion0.atLeast(javaVersion4);
        java.lang.String str6 = javaVersion0.toString();
        org.junit.Assert.assertTrue("'" + javaVersion0 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_4 + "'", javaVersion0.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        org.junit.Assert.assertTrue("'" + javaVersion1 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_0_9 + "'", javaVersion1.equals(org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.4" + "'", str3.equals("1.4"));
        org.junit.Assert.assertTrue("'" + javaVersion4 + "' != '" + org.apache.commons.lang3.JavaVersion.JAVA_1_1 + "'", javaVersion4.equals(org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.4" + "'", str6.equals("1.4"));
    }
}

