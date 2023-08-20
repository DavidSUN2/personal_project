
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test cases for the {@link Fraction} class
 *
 * @version $Id$
 */
public class FractionTest  {
    
    private static final int SKIP = 500;  //53

    @Test
    public void Fraction() {
        Fraction f = null;
        
        f = Fraction.getFraction(50, 75);
        f = f.abs();
        assertEquals(50, f.getNumerator());
        assertEquals(75, f.getDenominator());
        
        f = Fraction.getFraction(-50, 75);
        f = f.abs();
        assertEquals(50, f.getNumerator());
        assertEquals(75, f.getDenominator());

        f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        f = f.abs();
        assertEquals(Integer.MAX_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());

        f = Fraction.getFraction(Integer.MAX_VALUE, -1);
        f = f.abs();
        assertEquals(Integer.MAX_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());

        f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        try {
            f = f.abs();
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }
    
    @Test
    public void Fraction() {
        Fraction f = null;
        
        f = Fraction.getFraction(3, 5);
        assertEquals(Fraction.ONE, f.pow(0));
        
        f = Fraction.getFraction(3, 5);
        assertSame(f, f.pow(1));
        assertEquals(f, f.pow(1));

        f = Fraction.getFraction(3, 5);
        f = f.pow(2);
        assertEquals(9, f.getNumerator());
        assertEquals(25, f.getDenominator());
        
        f = Fraction.getFraction(3, 5);
        f = f.pow(3);
        assertEquals(27, f.getNumerator());
        assertEquals(125, f.getDenominator());
        
        f = Fraction.getFraction(3, 5);
        f = f.pow(-1);
        assertEquals(5, f.getNumerator());
        assertEquals(3, f.getDenominator());
        
        f = Fraction.getFraction(3, 5);
        f = f.pow(-2);
        assertEquals(25, f.getNumerator());
        assertEquals(9, f.getDenominator());
        
        // check unreduced fractions stay that way.
        f = Fraction.getFraction(6, 10);
        assertEquals(Fraction.ONE, f.pow(0));
        
        f = Fraction.getFraction(6, 10);
        assertEquals(f, f.pow(1));
        assertFalse(f.pow(1).equals(Fraction.getFraction(3,5)));

        f = Fraction.getFraction(6, 10);
        f = f.pow(2);
        assertEquals(9, f.getNumerator());
        assertEquals(25, f.getDenominator());
        
        f = Fraction.getFraction(6, 10);
        f = f.pow(3);
        assertEquals(27, f.getNumerator());
        assertEquals(125, f.getDenominator());
        
        f = Fraction.getFraction(6, 10);
        f = f.pow(-1);
        assertEquals(10, f.getNumerator());
        assertEquals(6, f.getDenominator());
        
        f = Fraction.getFraction(6, 10);
        f = f.pow(-2);
        assertEquals(25, f.getNumerator());
        assertEquals(9, f.getDenominator());
        
        // zero to any positive power is still zero.
        f = Fraction.getFraction(0, 1231);
        f = f.pow(1);
        assertTrue(0==f.compareTo(Fraction.ZERO));
        assertEquals(0, f.getNumerator());
        assertEquals(1231, f.getDenominator());
        f = f.pow(2);
        assertTrue(0==f.compareTo(Fraction.ZERO));
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());

        // zero to negative powers should throw an exception
        try {
            f = f.pow(-1);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        try {
            f = f.pow(Integer.MIN_VALUE);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // one to any power is still one.
        f = Fraction.getFraction(1, 1);
        f = f.pow(0);
        assertEquals(f, Fraction.ONE);
        f = f.pow(1);
        assertEquals(f, Fraction.ONE);
        f = f.pow(-1);
        assertEquals(f, Fraction.ONE);
        f = f.pow(Integer.MAX_VALUE);
        assertEquals(f, Fraction.ONE);
        f = f.pow(Integer.MIN_VALUE);
        assertEquals(f, Fraction.ONE);

        f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        try {
            f = f.pow(2);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // Numerator growing too negative during the pow operation.
        f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        try {
            f = f.pow(3);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        f = Fraction.getFraction(65536, 1);
        try {
            f = f.pow(2);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }
    
    @Test
    public void Fraction() {
        Fraction f = null;
        Fraction f1 = null;
        Fraction f2 = null;
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(1, 5);
        f = f1.add(f2);
        assertEquals(4, f.getNumerator());
        assertEquals(5, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(2, 5);
        f = f1.add(f2);
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(3, 5);
        f = f1.add(f2);
        assertEquals(6, f.getNumerator());
        assertEquals(5, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(-4, 5);
        f = f1.add(f2);
        assertEquals(-1, f.getNumerator());
        assertEquals(5, f.getDenominator());
        
        f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        f2 = Fraction.ONE;
        f = f1.add(f2);
        assertEquals(Integer.MAX_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(1, 2);
        f = f1.add(f2);
        assertEquals(11, f.getNumerator());
        assertEquals(10, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 8);
        f2 = Fraction.getFraction(1, 6);
        f = f1.add(f2);
        assertEquals(13, f.getNumerator());
        assertEquals(24, f.getDenominator());
        
        f1 = Fraction.getFraction(0, 5);
        f2 = Fraction.getFraction(1, 5);
        f = f1.add(f2);
        assertSame(f2, f);
        f = f2.add(f1);
        assertSame(f2, f);
        
        f1 = Fraction.getFraction(-1, 13*13*2*2);
        f2 = Fraction.getFraction(-2, 13*17*2);
        f = f1.add(f2);
        assertEquals(13*13*17*2*2, f.getDenominator());
        assertEquals(-17 - 2*13*2, f.getNumerator());
        
        try {
            f.add(null);
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        // if this fraction is added naively, it will overflow.
        // check that it doesn't.
        f1 = Fraction.getFraction(1,32768*3);
        f2 = Fraction.getFraction(1,59049);
        f = f1.add(f2);
        assertEquals(52451, f.getNumerator());
        assertEquals(1934917632, f.getDenominator());

        f1 = Fraction.getFraction(Integer.MIN_VALUE, 3);
        f2 = Fraction.ONE_THIRD;
        f = f1.add(f2);
        assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        assertEquals(3, f.getDenominator());
        
        f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        f2 = Fraction.ONE;
        f = f1.add(f2);
        assertEquals(Integer.MAX_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
        
        try {
            f = f.add(Fraction.ONE); // should overflow
            fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        // denominator should not be a multiple of 2 or 3 to trigger overflow
        f1 = Fraction.getFraction(Integer.MIN_VALUE, 5);
        f2 = Fraction.getFraction(-1,5);
        try {
            f = f1.add(f2); // should overflow
            fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        try {
            f= Fraction.getFraction(-Integer.MAX_VALUE, 1);
            f = f.add(f);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        try {
            f= Fraction.getFraction(-Integer.MAX_VALUE, 1);
            f = f.add(f);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        f1 = Fraction.getFraction(3,327680);
        f2 = Fraction.getFraction(2,59049);
        try {
            f = f1.add(f2); // should overflow
            fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
    }
            
    @Test
    public void Fraction() {
        Fraction f = null;
        Fraction f1 = null;
        Fraction f2 = null;
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(1, 5);
        f = f1.subtract(f2);
        assertEquals(2, f.getNumerator());
        assertEquals(5, f.getDenominator());
        
        f1 = Fraction.getFraction(7, 5);
        f2 = Fraction.getFraction(2, 5);
        f = f1.subtract(f2);
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(3, 5);
        f = f1.subtract(f2);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(-4, 5);
        f = f1.subtract(f2);
        assertEquals(7, f.getNumerator());
        assertEquals(5, f.getDenominator());
        
        f1 = Fraction.getFraction(0, 5);
        f2 = Fraction.getFraction(4, 5);
        f = f1.subtract(f2);
        assertEquals(-4, f.getNumerator());
        assertEquals(5, f.getDenominator());
        
        f1 = Fraction.getFraction(0, 5);
        f2 = Fraction.getFraction(-4, 5);
        f = f1.subtract(f2);
        assertEquals(4, f.getNumerator());
        assertEquals(5, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(1, 2);
        f = f1.subtract(f2);
        assertEquals(1, f.getNumerator());
        assertEquals(10, f.getDenominator());
        
        f1 = Fraction.getFraction(0, 5);
        f2 = Fraction.getFraction(1, 5);
        f = f2.subtract(f1);
        assertSame(f2, f);
        
        try {
            f.subtract(null);
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        // if this fraction is subtracted naively, it will overflow.
        // check that it doesn't.
        f1 = Fraction.getFraction(1,32768*3);
        f2 = Fraction.getFraction(1,59049);
        f = f1.subtract(f2);
        assertEquals(-13085, f.getNumerator());
        assertEquals(1934917632, f.getDenominator());

        f1 = Fraction.getFraction(Integer.MIN_VALUE, 3);
        f2 = Fraction.ONE_THIRD.negate();
        f = f1.subtract(f2);
        assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        assertEquals(3, f.getDenominator());
        
        f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        f2 = Fraction.ONE;
        f = f1.subtract(f2);
        assertEquals(Integer.MAX_VALUE-1, f.getNumerator());
        assertEquals(1, f.getDenominator());

        try {
            f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            f2 = Fraction.getFraction(1, Integer.MAX_VALUE - 1);
            f = f1.subtract(f2);
            fail("expecting ArithmeticException");  //should overflow
        } catch (final ArithmeticException ex) {}
            
        // denominator should not be a multiple of 2 or 3 to trigger overflow
        f1 = Fraction.getFraction(Integer.MIN_VALUE, 5);
        f2 = Fraction.getFraction(1,5);
        try {
            f = f1.subtract(f2); // should overflow
            fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        try {
            f= Fraction.getFraction(Integer.MIN_VALUE, 1);
            f = f.subtract(Fraction.ONE);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        try {
            f= Fraction.getFraction(Integer.MAX_VALUE, 1);
            f = f.subtract(Fraction.ONE.negate());
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        f1 = Fraction.getFraction(3,327680);
        f2 = Fraction.getFraction(2,59049);
        try {
            f = f1.subtract(f2); // should overflow
            fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
    }
            
    @Test
    public void Fraction() {
        Fraction f = null;
        Fraction f1 = null;
        Fraction f2 = null;
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(2, 5);
        f = f1.multiplyBy(f2);
        assertEquals(6, f.getNumerator());
        assertEquals(25, f.getDenominator());
        
        f1 = Fraction.getFraction(6, 10);
        f2 = Fraction.getFraction(6, 10);
        f = f1.multiplyBy(f2);
        assertEquals(9, f.getNumerator());
        assertEquals(25, f.getDenominator());
        f = f.multiplyBy(f2);
        assertEquals(27, f.getNumerator());
        assertEquals(125, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(-2, 5);
        f = f1.multiplyBy(f2);
        assertEquals(-6, f.getNumerator());
        assertEquals(25, f.getDenominator());
        
        f1 = Fraction.getFraction(-3, 5);
        f2 = Fraction.getFraction(-2, 5);
        f = f1.multiplyBy(f2);
        assertEquals(6, f.getNumerator());
        assertEquals(25, f.getDenominator());
        
        
        f1 = Fraction.getFraction(0, 5);
        f2 = Fraction.getFraction(2, 7);
        f = f1.multiplyBy(f2);
        assertSame(Fraction.ZERO, f);
        
        f1 = Fraction.getFraction(2, 7);
        f2 = Fraction.ONE;
        f = f1.multiplyBy(f2);
        assertEquals(2, f.getNumerator());
        assertEquals(7, f.getDenominator());
        
        f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        f2 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        f = f1.multiplyBy(f2);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());

        try {
            f.multiplyBy(null);
            fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        try {
            f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            f = f1.multiplyBy(f1);  // should overflow
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        try {
            f1 = Fraction.getFraction(1, -Integer.MAX_VALUE);
            f = f1.multiplyBy(f1);  // should overflow
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }
            
    @Test
    public void Fraction() {
        Fraction f = null;
        Fraction f1 = null;
        Fraction f2 = null;
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(2, 5);
        f = f1.divideBy(f2);
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.ZERO;
        try {
            f = f1.divideBy(f2);
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        f1 = Fraction.getFraction(0, 5);
        f2 = Fraction.getFraction(2, 7);
        f = f1.divideBy(f2);
        assertSame(Fraction.ZERO, f);
        
        f1 = Fraction.getFraction(2, 7);
        f2 = Fraction.ONE;
        f = f1.divideBy(f2);
        assertEquals(2, f.getNumerator());
        assertEquals(7, f.getDenominator());
        
        f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
        f = f1.divideBy(f1);  
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
        
        f1 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        f2 = Fraction.getFraction(1, Integer.MAX_VALUE);
        f = f1.divideBy(f2);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());

        try {
            f.divideBy(null);
            fail("IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        try {
            f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            f = f1.divideBy(f1.invert());  // should overflow
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        try {
            f1 = Fraction.getFraction(1, -Integer.MAX_VALUE);
            f = f1.divideBy(f1.invert());  // should overflow
            fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }
            
    @Test
    public void Fraction() {
        Fraction f1 = null;
        Fraction f2 = null;
        
        f1 = Fraction.getFraction(3, 5);
        assertFalse(f1.equals(null));
        assertFalse(f1.equals(new Object()));
        assertFalse(f1.equals(Integer.valueOf(6)));
        
        f1 = Fraction.getFraction(3, 5);
        f2 = Fraction.getFraction(2, 5);
        assertFalse(f1.equals(f2));
        assertTrue(f1.equals(f1));
        assertTrue(f2.equals(f2));
        
        f2 = Fraction.getFraction(3, 5);
        assertTrue(f1.equals(f2));
        
        f2 = Fraction.getFraction(6, 10);
        assertFalse(f1.equals(f2));
    }
    
    @Test
    public void Fraction() {
        final Fraction f1 = Fraction.getFraction(3, 5);
        Fraction f2 = Fraction.getFraction(3, 5);
        
        assertTrue(f1.hashCode() == f2.hashCode());
        
        f2 = Fraction.getFraction(2, 5);
        assertTrue(f1.hashCode() != f2.hashCode());
        
        f2 = Fraction.getFraction(6, 10);
        assertTrue(f1.hashCode() != f2.hashCode());
    }
    
    @Test
    public void Fraction() {
        Fraction f1 = null;
        Fraction f2 = null;
        
        f1 = Fraction.getFraction(3, 5);
        assertTrue(f1.compareTo(f1) == 0);
        
        try {
            f1.compareTo(null);
            fail("expecting NullPointerException");
        } catch (final NullPointerException ex) {}
        
        f2 = Fraction.getFraction(2, 5);
        assertTrue(f1.compareTo(f2) > 0);
        assertTrue(f2.compareTo(f2) == 0);
        
        f2 = Fraction.getFraction(4, 5);
        assertTrue(f1.compareTo(f2) < 0);
        assertTrue(f2.compareTo(f2) == 0);
        
        f2 = Fraction.getFraction(3, 5);
        assertTrue(f1.compareTo(f2) == 0);
        assertTrue(f2.compareTo(f2) == 0);
        
        f2 = Fraction.getFraction(6, 10);
        assertTrue(f1.compareTo(f2) == 0);
        assertTrue(f2.compareTo(f2) == 0);

        f2 = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        assertTrue(f1.compareTo(f2) > 0);
        assertTrue(f2.compareTo(f2) == 0);

    }
    
    @Test
    public void Fraction() {
        Fraction f = null;

        f = Fraction.getFraction(3, 5);
        final String str = f.toString();
        assertEquals("3/5", str);
        assertSame(str, f.toString());
        
        f = Fraction.getFraction(7, 5);
        assertEquals("7/5", f.toString());        
        
        f = Fraction.getFraction(4, 2);
        assertEquals("4/2", f.toString());        
        
        f = Fraction.getFraction(0, 2);
        assertEquals("0/2", f.toString());        
        
        f = Fraction.getFraction(2, 2);
        assertEquals("2/2", f.toString());        

        f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        assertEquals("-2147483648/1", f.toString());        

        f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        assertEquals("-2147483648/2147483647", f.toString());
    }
    
    @Test
    public void Fraction() {
        Fraction f = null;

        f = Fraction.getFraction(3, 5);
        final String str = f.toProperString();
        assertEquals("3/5", str);
        assertSame(str, f.toProperString());
        
        f = Fraction.getFraction(7, 5);
        assertEquals("1 2/5", f.toProperString());        
        
        f = Fraction.getFraction(14, 10);
        assertEquals("1 4/10", f.toProperString());        
        
        f = Fraction.getFraction(4, 2);
        assertEquals("2", f.toProperString());        
        
        f = Fraction.getFraction(0, 2);
        assertEquals("0", f.toProperString());        
        
        f = Fraction.getFraction(2, 2);
        assertEquals("1", f.toProperString());        
        
        f = Fraction.getFraction(-7, 5);
        assertEquals("-1 2/5", f.toProperString());        

        f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        assertEquals("-2147483648", f.toProperString());        

        f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        assertEquals("-1 1/2147483647", f.toProperString());

        assertEquals("-1", Fraction.getFraction(-1).toProperString());
    }
}
