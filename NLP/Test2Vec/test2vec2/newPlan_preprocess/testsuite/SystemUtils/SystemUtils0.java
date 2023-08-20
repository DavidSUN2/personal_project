package SystemUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemUtils0 {

    public static boolean debug = false;

    @Test
    public void SystemUtils01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils01");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "52.0" + "'", str0.equals("52.0"));
    }

    @Test
    public void SystemUtils02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils02");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\r\n" + "'", str0.equals("\r\n"));
    }

    @Test
    public void SystemUtils03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils03");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_FREE_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils04");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java(TM) SE Runtime Environment" + "'", str0.equals("Java(TM) SE Runtime Environment"));
    }

    @Test
    public void SystemUtils05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils05");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils06");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_FONTS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils07");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.AWT_TOOLKIT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.windows.WToolkit" + "'", str0.equals("sun.awt.windows.WToolkit"));
    }

    @Test
    public void SystemUtils08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils08");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils09");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java HotSpot(TM) 64-Bit Server VM" + "'", str0.equals("Java HotSpot(TM) 64-Bit Server VM"));
    }

    @Test
    public void SystemUtils10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils10");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_COMPILER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils11");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8" + "'", str0.equals("1.8"));
    }

    @Test
    public void SystemUtils12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils12");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Windows 10" + "'", str0.equals("Windows 10"));
    }

    @Test
    public void SystemUtils13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils13");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_ENCODING;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Cp1252" + "'", str0.equals("Cp1252"));
    }

    @Test
    public void SystemUtils14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils14");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void SystemUtils15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils15");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_OS2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils16");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_PATH;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "E:\\randoop-4.2.1\\tbin;E:\\randoop-4.2.1\\randoop-all-4.2.1.jar" + "'", str0.equals("E:\\randoop-4.2.1\\tbin;E:\\randoop-4.2.1\\randoop-all-4.2.1.jar"));
    }

    @Test
    public void SystemUtils17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils17");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_NT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils18");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2008;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils19");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_LINUX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils20");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_95;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils21");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils22");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils23");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.PATH_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + ";" + "'", str0.equals(";"));
    }

    @Test
    public void SystemUtils24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils24");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils25");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_HOME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre"));
    }

    @Test
    public void SystemUtils26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils26");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_3;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils27");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_EXT_DIRS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext"));
    }

    @Test
    public void SystemUtils28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils28");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "lilya" + "'", str0.equals("lilya"));
    }

    @Test
    public void SystemUtils29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils29");
        org.apache.commons.lang3.JavaVersion javaVersion0 = null;
        // The following exception was thrown during execution in SystemUtils generation
        try {
            boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(javaVersion0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void SystemUtils30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils30");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_HP_UX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils31");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils32");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SUN_OS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils33");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_HEADLESS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils34");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java Platform API Specification" + "'", str0.equals("Java Platform API Specification"));
    }

    @Test
    public void SystemUtils35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils35");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "25.221-b11" + "'", str0.equals("25.221-b11"));
    }

    @Test
    public void SystemUtils36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils36");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils37");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2003;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils38");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils39");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8" + "'", str0.equals("1.8"));
    }

    @Test
    public void SystemUtils40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils40");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils41");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_LANGUAGE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "en" + "'", str0.equals("en"));
    }

    @Test
    public void SystemUtils42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils42");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2000;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils43");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils44");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SOLARIS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils45");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_HOME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Users\\lilya" + "'", str0.equals("C:\\Users\\lilya"));
    }

    @Test
    public void SystemUtils46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils46");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_COUNTRY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "US" + "'", str0.equals("US"));
    }

    @Test
    public void SystemUtils47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils47");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils48");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_LIBRARY_PATH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\WINDOWS\\Sun\\Java\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.8.0_221;C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\MATLAB\\R2018a\\bin;C:\\Program Files\\Git\\cmd;C:\\Program Files\\PuTTY\\;C:\\HashiCorp\\Vagrant\\bin;C:\\spark\\spark\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Users\\lilya\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\lilya\\AppData\\Local\\Google\\Cloud SDK\\google-cloud-sdk\\bin;;." + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\WINDOWS\\Sun\\Java\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.8.0_221;C:\\Program Files\\Java\\jdk1.8.0_221\\bin;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\iCLS\\;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\DAL;C:\\Program Files (x86)\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\Intel\\Intel(R) Management Engine Components\\IPT;C:\\Program Files\\MATLAB\\R2018a\\bin;C:\\Program Files\\Git\\cmd;C:\\Program Files\\PuTTY\\;C:\\HashiCorp\\Vagrant\\bin;C:\\spark\\spark\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Users\\lilya\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\lilya\\AppData\\Local\\Google\\Cloud SDK\\google-cloud-sdk\\bin;;."));
    }

    @Test
    public void SystemUtils49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils49");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_DIR;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "E:\\randoop-4.2.1\\tbin" + "'", str0.equals("E:\\randoop-4.2.1\\tbin"));
    }

    @Test
    public void SystemUtils50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils50");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils51");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_AIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils52");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_PRINTERJOB;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.windows.WPrinterJob" + "'", str0.equals("sun.awt.windows.WPrinterJob"));
    }

    @Test
    public void SystemUtils53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils53");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR_URL;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://java.oracle.com/" + "'", str0.equals("http://java.oracle.com/"));
    }

    @Test
    public void SystemUtils54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils54");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8.0_221-b11" + "'", str0.equals("1.8.0_221-b11"));
    }

    @Test
    public void SystemUtils55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils55");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_ME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils56");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_TIMEZONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void SystemUtils57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils57");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_UTIL_PREFS_PREFERENCES_FACTORY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void SystemUtils58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils58");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils59");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_98;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils60");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "10.0" + "'", str0.equals("10.0"));
    }

    @Test
    public void SystemUtils61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils61");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_INFO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mixed mode" + "'", str0.equals("mixed mode"));
    }

    @Test
    public void SystemUtils62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils62");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_XP;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils63");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_OPEN_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils64");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils65");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_ARCH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "amd64" + "'", str0.equals("amd64"));
    }

    @Test
    public void SystemUtils66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils66");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_ENDORSED_DIRS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\endorsed" + "'", str0.equals("C:\\Program Files\\Java\\jdk1.8.0_221\\jre\\lib\\endorsed"));
    }

    @Test
    public void SystemUtils67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils67");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\\" + "'", str0.equals("\\"));
    }

    @Test
    public void SystemUtils68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils68");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VERSION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.8.0_221" + "'", str0.equals("1.8.0_221"));
    }

    @Test
    public void SystemUtils69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils69");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VENDOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0.equals("Oracle Corporation"));
    }

    @Test
    public void SystemUtils70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils70");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_NAME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Java Virtual Machine Specification" + "'", str0.equals("Java Virtual Machine Specification"));
    }

    @Test
    public void SystemUtils71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils71");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_VISTA;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils72");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_GRAPHICSENV;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sun.awt.Win32GraphicsEnvironment" + "'", str0.equals("sun.awt.Win32GraphicsEnvironment"));
    }

    @Test
    public void SystemUtils73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils73");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_IO_TMPDIR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C:\\Users\\lilya\\AppData\\Local\\Temp\\" + "'", str0.equals("C:\\Users\\lilya\\AppData\\Local\\Temp\\"));
    }

    @Test
    public void SystemUtils74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils74");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_IRIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils75");
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
    public void SystemUtils76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils76");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_NET_BSD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils77");
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
    public void SystemUtils78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils78");
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
    public void SystemUtils79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils79");
        org.apache.commons.lang3.SystemUtils systemUtils0 = new org.apache.commons.lang3.SystemUtils();
        java.lang.Class<?> wildcardClass1 = systemUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SystemUtils80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils80");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_UNIX;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void SystemUtils81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils81");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void SystemUtils82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemUtils0.SystemUtils82");
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
