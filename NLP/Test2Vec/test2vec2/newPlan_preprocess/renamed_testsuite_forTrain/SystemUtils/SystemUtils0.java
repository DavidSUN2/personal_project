
package SystemUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemUtils0 {

    public static boolean debug = false;

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test01");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "52.0" + "'", str0.equals("52.0"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test02");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\r\n" + "'", str0.equals("\r\n"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test03");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_FREE_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test04");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java(TM) SE Runtime Environment" + "'", str0.equals("Java(TM) SE Runtime Environment"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test05");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test06");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_FONTS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test07");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.AWT_TOOLKIT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.windows.WToolkit" + "'", str0.equals("sun.awt.windows.WToolkit"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test08");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test09");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java HotSpot(TM) 64-Bit Server VM" + "'", str0.equals("Java HotSpot(TM) 64-Bit Server VM"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test10");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_COMPILER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test11");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8" + "'", str0.equals("1.8"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test12");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Windows 10" + "'", str0.equals("Windows 10"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test13");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_ENCODING;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Cp1252" + "'", str0.equals("Cp1252"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test14");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test15");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_OS2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test16");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_PATH;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "E:\\randoop-4.2.1\\tbin;E:\\randoop-4.2.1\\randoop-all-4.2.1.jar" + "'", str0.equals("E:\\randoop-4.2.1\\tbin;E:\\randoop-4.2.1\\randoop-all-4.2.1.jar"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test17");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_NT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test18");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2008;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test19");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_LINUX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test20");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_95;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test21");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test22");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test23");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.PATH_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + ";" + "'", str0.equals(";"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test24");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test25");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_HOME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test26");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_3;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test27");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_EXT_DIRS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test28");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "lilya" + "'", str0.equals("lilya"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test29");
        org.apache.commons.lang3.JavaVersion javaVersion0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(javaVersion0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test30");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_HP_UX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test31");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test32");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SUN_OS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test33");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_HEADLESS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test34");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java Platform API Specification" + "'", str0.equals("Java Platform API Specification"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test35");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "25.221-b11" + "'", str0.equals("25.221-b11"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test36");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test37");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2003;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test38");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test39");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8" + "'", str0.equals("1.8"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test40");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test41");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_LANGUAGE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "en" + "'", str0.equals("en"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test42");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2000;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test43");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test44");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SOLARIS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test45");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_HOME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Users\\lilya" + "'", str0.equals("C:\\Users\\lilya"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test46");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_COUNTRY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "US" + "'", str0.equals("US"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test47");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test48");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_LIBRARY_PATH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\WINDOWS\\Sun\\Java\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.8.0_221;C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\MATLAB\\R2018a\\bin;C:\\Program Files\\Git\\cmd;C:\\Program Files\\PuTTY\\;C:\\HashiCorp\\Vagrant\\bin;C:\\spark\\spark\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Users\\lilya\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\lilya\\AppData\\Local\\Google\\Cloud SDK\\google-cloud-sdk\\bin;;." + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\WINDOWS\\Sun\\Java\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.8.0_221;C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\MATLAB\\R2018a\\bin;C:\\Program Files\\Git\\cmd;C:\\Program Files\\PuTTY\\;C:\\HashiCorp\\Vagrant\\bin;C:\\spark\\spark\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Users\\lilya\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\lilya\\AppData\\Local\\Google\\Cloud SDK\\google-cloud-sdk\\bin;;."));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test49");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_DIR;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "E:\\randoop-4.2.1\\tbin" + "'", str0.equals("E:\\randoop-4.2.1\\tbin"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test50");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test51");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_AIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test52");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_PRINTERJOB;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.windows.WPrinterJob" + "'", str0.equals("sun.awt.windows.WPrinterJob"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test53");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR_URL;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://java.oracle.com/" + "'", str0.equals("http://java.oracle.com/"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test54");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8.0_221-b11" + "'", str0.equals("1.8.0_221-b11"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test55");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_ME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test56");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_TIMEZONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test57");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_UTIL_PREFS_PREFERENCES_FACTORY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test58");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test59");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_98;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test60");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "10.0" + "'", str0.equals("10.0"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test61");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_INFO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mixed mode" + "'", str0.equals("mixed mode"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test62");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_XP;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test63");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_OPEN_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test64");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test65");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_ARCH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "amd64" + "'", str0.equals("amd64"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test66");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_ENDORSED_DIRS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\endorsed" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\endorsed"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test67");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\\" + "'", str0.equals("\\"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test68");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8.0_221" + "'", str0.equals("1.8.0_221"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test69");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test70");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java Virtual Machine Specification" + "'", str0.equals("Java Virtual Machine Specification"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test71");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_VISTA;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test72");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_GRAPHICSENV;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.Win32GraphicsEnvironment" + "'", str0.equals("sun.awt.Win32GraphicsEnvironment"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test73");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_IO_TMPDIR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Users\\lilya\\AppData\\Local\\Temp\\" + "'", str0.equals("C:\\Users\\lilya\\AppData\\Local\\Temp\\"));
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test74");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_IRIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test75");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getUserHome();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(file0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Users");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Users\\lilya");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test76");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_NET_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test77");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(file0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Users\\lilya\\AppData\\Local");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Users\\lilya\\AppData\\Local\\Temp");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test78");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getUserDir();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(file0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(file0.getParent(), "E:\\randoop-4.2.1");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(file0.toString(), "E:\\randoop-4.2.1\\tbin");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test79");
        org.apache.commons.lang3.SystemUtils systemUtils0 = new org.apache.commons.lang3.SystemUtils();
        java.lang.Class<?> wildcardClass1 = systemUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test80");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_UNIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test81");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SystemUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test82");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getJavaHome();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(file0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Program Files\\Java\\jdk1.8.0_221");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Program Files\\Java\\jdk1.8.0_221\\jre");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}
