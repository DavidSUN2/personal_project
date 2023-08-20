package SystemUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test01");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.AWT_TOOLKIT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.windows.WToolkit" + "'", str0.equals("sun.awt.windows.WToolkit"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test02");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_HEADLESS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test03");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_AIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test04");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test05");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test06");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_NT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test07");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_98;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test08");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_UTIL_PREFS_PREFERENCES_FACTORY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test09");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test10");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_LIBRARY_PATH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\WINDOWS\\Sun\\Java\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.8.0_221;C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\MATLAB\\R2018a\\bin;C:\\Program Files\\Git\\cmd;C:\\Program Files\\PuTTY\\;C:\\HashiCorp\\Vagrant\\bin;C:\\spark\\spark\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Users\\lilya\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\lilya\\AppData\\Local\\Google\\Cloud SDK\\google-cloud-sdk\\bin;;." + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\WINDOWS\\Sun\\Java\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.8.0_221;C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\MATLAB\\R2018a\\bin;C:\\Program Files\\Git\\cmd;C:\\Program Files\\PuTTY\\;C:\\HashiCorp\\Vagrant\\bin;C:\\spark\\spark\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Users\\lilya\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\lilya\\AppData\\Local\\Google\\Cloud SDK\\google-cloud-sdk\\bin;;."));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test11");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_IO_TMPDIR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Users\\lilya\\AppData\\Local\\Temp\\" + "'", str0.equals("C:\\Users\\lilya\\AppData\\Local\\Temp\\"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test12");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_HOME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test13");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test14");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2008;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test15");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8.0_221-b11" + "'", str0.equals("1.8.0_221-b11"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test16");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_IRIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test17");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test18");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\\" + "'", str0.equals("\\"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test19");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_OPEN_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test20");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java Platform API Specification" + "'", str0.equals("Java Platform API Specification"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test21");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_NET_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test22");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SOLARIS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test23");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_XP;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test24");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "10.0" + "'", str0.equals("10.0"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test25");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.PATH_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + ";" + "'", str0.equals(";"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test26");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_OS2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test27");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test28");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java(TM) SE Runtime Environment" + "'", str0.equals("Java(TM) SE Runtime Environment"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test29");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_PRINTERJOB;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.windows.WPrinterJob" + "'", str0.equals("sun.awt.windows.WPrinterJob"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test30");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_GRAPHICSENV;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.Win32GraphicsEnvironment" + "'", str0.equals("sun.awt.Win32GraphicsEnvironment"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test31");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Windows 10" + "'", str0.equals("Windows 10"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test32");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_EXT_DIRS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test33");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test34");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_ENDORSED_DIRS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\endorsed" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\endorsed"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test35");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_HOME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Users\\lilya" + "'", str0.equals("C:\\Users\\lilya"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test36");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test37");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_VISTA;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test38");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8.0_221" + "'", str0.equals("1.8.0_221"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test39");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test40");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_UNIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test41");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test42");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test43");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java Virtual Machine Specification" + "'", str0.equals("Java Virtual Machine Specification"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test44");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_HP_UX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test45");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test46");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test47");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test48");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "lilya" + "'", str0.equals("lilya"));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test49");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java HotSpot(TM) 64-Bit Server VM" + "'", str0.equals("Java HotSpot(TM) 64-Bit Server VM"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test50");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2000;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test51");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_COUNTRY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "US" + "'", str0.equals("US"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test52");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_3;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test53");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_DIR;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "E:\\randoop-4.2.1\\tbin" + "'", str0.equals("E:\\randoop-4.2.1\\tbin"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test54");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test55");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test56");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR_URL;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://java.oracle.com/" + "'", str0.equals("http://java.oracle.com/"));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test57");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_LANGUAGE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "en" + "'", str0.equals("en"));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test58");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_FONTS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test59");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "52.0" + "'", str0.equals("52.0"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test60");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_ME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test61");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2003;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test62");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_95;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test63");
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test64");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "25.221-b11" + "'", str0.equals("25.221-b11"));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test65");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8" + "'", str0.equals("1.8"));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test66");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_PATH;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "E:\\randoop-4.2.1\\tbin;E:\\randoop-4.2.1\\randoop-all-4.2.1.jar" + "'", str0.equals("E:\\randoop-4.2.1\\tbin;E:\\randoop-4.2.1\\randoop-all-4.2.1.jar"));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test67");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_COMPILER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test68");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_INFO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mixed mode" + "'", str0.equals("mixed mode"));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test69");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_TIMEZONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test70");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8" + "'", str0.equals("1.8"));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test71");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_ENCODING;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Cp1252" + "'", str0.equals("Cp1252"));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test72");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test73");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SUN_OS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test74");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\r\n" + "'", str0.equals("\r\n"));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test75");
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

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test76");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_FREE_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test77");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_LINUX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test78");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_ARCH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "amd64" + "'", str0.equals("amd64"));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test79");
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
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test80");
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
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test81");
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
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.test82");
        org.apache.commons.lang3.SystemUtils systemUtils0 = new org.apache.commons.lang3.SystemUtils();
        java.lang.Class<?> wildcardClass1 = systemUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}
