package ReflectionToStringBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void ReflectionToStringBuilder01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder01");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder02");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder03");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder04");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder05");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d), toStringStyle3, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0, toStringStyle3);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder8.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder06");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("hi!", (int) (byte) 0);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder07");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder08");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = reflectionToStringBuilder4.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder09");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append(100);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder10");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", (int) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("", 1.0f);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder11");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void ReflectionToStringBuilder12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.ReflectionToStringBuilder12");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder6.append((int) (byte) -1);
        // during ReflectionToStringBuilder generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray9 = reflectionToStringBuilder6.getExcludeFieldNames();
    }
}

