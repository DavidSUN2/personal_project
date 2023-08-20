
package Fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Fraction1 {

    public static boolean debug = false;

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction1.test501");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 1, (int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.divideBy(fraction3);
        short short5 = fraction4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -5 + "'", short5 == (short) -5);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction1.test502");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction1.test503");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction6.getProperNumerator();
        java.lang.Class<?> wildcardClass8 = fraction6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction1.test504");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }
}

