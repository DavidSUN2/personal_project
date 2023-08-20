
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.NumberUtils}.
 *
 * @version $Id$
 */
public class NumberUtilsTest {

    //-----------------------------------------------------------------------
    @Test
    public void NumberUtils() {
        assertNotNull(new NumberUtils());
        final Constructor<?>[] cons = NumberUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        assertTrue(Modifier.isPublic(NumberUtils.class.getModifiers()));
        assertFalse(Modifier.isFinal(NumberUtils.class.getModifiers()));
    }

    //---------------------------------------------------------------------

    /**
     * Test for {@link NumberUtils#toInt(String)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toInt(String) 1 failed", NumberUtils.toInt("12345") == 12345);
        assertTrue("toInt(String) 2 failed", NumberUtils.toInt("abc") == 0);
        assertTrue("toInt(empty) failed", NumberUtils.toInt("") == 0);
        assertTrue("toInt(null) failed", NumberUtils.toInt(null) == 0);
    }

    /**
     * Test for {@link NumberUtils#toInt(String, int)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toInt(String,int) 1 failed", NumberUtils.toInt("12345", 5) == 12345);
        assertTrue("toInt(String,int) 2 failed", NumberUtils.toInt("1234.5", 5) == 5);
    }

    /**
     * Test for {@link NumberUtils#toLong(String)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toLong(String) 1 failed", NumberUtils.toLong("12345") == 12345l);
        assertTrue("toLong(String) 2 failed", NumberUtils.toLong("abc") == 0l);
        assertTrue("toLong(String) 3 failed", NumberUtils.toLong("1L") == 0l);
        assertTrue("toLong(String) 4 failed", NumberUtils.toLong("1l") == 0l);
        assertTrue("toLong(Long.MAX_VALUE) failed", NumberUtils.toLong(Long.MAX_VALUE+"") == Long.MAX_VALUE);
        assertTrue("toLong(Long.MIN_VALUE) failed", NumberUtils.toLong(Long.MIN_VALUE+"") == Long.MIN_VALUE);
        assertTrue("toLong(empty) failed", NumberUtils.toLong("") == 0l);
        assertTrue("toLong(null) failed", NumberUtils.toLong(null) == 0l);
    }

    /**
     * Test for {@link NumberUtils#toLong(String, long)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toLong(String,long) 1 failed", NumberUtils.toLong("12345", 5l) == 12345l);
        assertTrue("toLong(String,long) 2 failed", NumberUtils.toLong("1234.5", 5l) == 5l);
    }

    /**
     * Test for {@link NumberUtils#toFloat(String)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toFloat(String) 1 failed", NumberUtils.toFloat("-1.2345") == -1.2345f);
        assertTrue("toFloat(String) 2 failed", NumberUtils.toFloat("1.2345") == 1.2345f);
        assertTrue("toFloat(String) 3 failed", NumberUtils.toFloat("abc") == 0.0f);
        assertTrue("toFloat(Float.MAX_VALUE) failed", NumberUtils.toFloat(Float.MAX_VALUE+"") ==  Float.MAX_VALUE);
        assertTrue("toFloat(Float.MIN_VALUE) failed", NumberUtils.toFloat(Float.MIN_VALUE+"") == Float.MIN_VALUE);
        assertTrue("toFloat(empty) failed", NumberUtils.toFloat("") == 0.0f);
        assertTrue("toFloat(null) failed", NumberUtils.toFloat(null) == 0.0f);
    }

    /**
     * Test for {@link NumberUtils#toFloat(String, float)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toFloat(String,int) 1 failed", NumberUtils.toFloat("1.2345", 5.1f) == 1.2345f);
        assertTrue("toFloat(String,int) 2 failed", NumberUtils.toFloat("a", 5.0f) == 5.0f);
    }
    
    /**
     * Test for {(@link NumberUtils#createNumber(String)}
     */
    @Test
    public void NumberUtils(){
        String shouldBeFloat = "1.23";
        String shouldBeDouble = "3.40282354e+38";
        String shouldBeBigDecimal = "1.797693134862315759e+308";
        
        assertTrue(NumberUtils.createNumber(shouldBeFloat) instanceof Float);
        assertTrue(NumberUtils.createNumber(shouldBeDouble) instanceof Double);
        assertTrue(NumberUtils.createNumber(shouldBeBigDecimal) instanceof BigDecimal);
    }
    /**
     * Test for {@link NumberUtils#toDouble(String)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toDouble(String) 1 failed", NumberUtils.toDouble("-1.2345") == -1.2345d);
        assertTrue("toDouble(String) 2 failed", NumberUtils.toDouble("1.2345") == 1.2345d);
        assertTrue("toDouble(String) 3 failed", NumberUtils.toDouble("abc") == 0.0d);
        assertTrue("toDouble(Double.MAX_VALUE) failed", NumberUtils.toDouble(Double.MAX_VALUE+"") == Double.MAX_VALUE);
        assertTrue("toDouble(Double.MIN_VALUE) failed", NumberUtils.toDouble(Double.MIN_VALUE+"") == Double.MIN_VALUE);
        assertTrue("toDouble(empty) failed", NumberUtils.toDouble("") == 0.0d);
        assertTrue("toDouble(null) failed", NumberUtils.toDouble(null) == 0.0d);
    }

    /**
     * Test for {@link NumberUtils#toDouble(String, double)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toDouble(String,int) 1 failed", NumberUtils.toDouble("1.2345", 5.1d) == 1.2345d);
        assertTrue("toDouble(String,int) 2 failed", NumberUtils.toDouble("a", 5.0d) == 5.0d);
    }

     /**
     * Test for {@link NumberUtils#toByte(String)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toByte(String) 1 failed", NumberUtils.toByte("123") == 123);
        assertTrue("toByte(String) 2 failed", NumberUtils.toByte("abc") == 0);
        assertTrue("toByte(empty) failed", NumberUtils.toByte("") == 0);
        assertTrue("toByte(null) failed", NumberUtils.toByte(null) == 0);
    }

    /**
     * Test for {@link NumberUtils#toByte(String, byte)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toByte(String,byte) 1 failed", NumberUtils.toByte("123", (byte) 5) == 123);
        assertTrue("toByte(String,byte) 2 failed", NumberUtils.toByte("12.3", (byte) 5) == 5);
    }

    /**
     * Test for {@link NumberUtils#toShort(String)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toShort(String) 1 failed", NumberUtils.toShort("12345") == 12345);
        assertTrue("toShort(String) 2 failed", NumberUtils.toShort("abc") == 0);
        assertTrue("toShort(empty) failed", NumberUtils.toShort("") == 0);
        assertTrue("toShort(null) failed", NumberUtils.toShort(null) == 0);
    }

    /**
     * Test for {@link NumberUtils#toShort(String, short)}.
     */
    @Test
    public void NumberUtils() {
        assertTrue("toShort(String,short) 1 failed", NumberUtils.toShort("12345", (short) 5) == 12345);
        assertTrue("toShort(String,short) 2 failed", NumberUtils.toShort("1234.5", (short) 5) == 5);
    }

    @Test
    public void NumberUtils() {
        // a lot of things can go wrong
        assertEquals("createNumber(String) 1 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5"));
        assertEquals("createNumber(String) 2 failed", Integer.valueOf("12345"), NumberUtils.createNumber("12345"));
        assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5D"));
        assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5d"));
        assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5F"));
        assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5f"));
        assertEquals("createNumber(String) 5 failed", Long.valueOf(Integer.MAX_VALUE + 1L), NumberUtils.createNumber(""
            + (Integer.MAX_VALUE + 1L)));
        assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345L"));
        assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345l"));
        assertEquals("createNumber(String) 7 failed", Float.valueOf("-1234.5"), NumberUtils.createNumber("-1234.5"));
        assertEquals("createNumber(String) 8 failed", Integer.valueOf("-12345"), NumberUtils.createNumber("-12345"));
        assertTrue("createNumber(String) 9a failed", 0xFADE == NumberUtils.createNumber("0xFADE").intValue());
        assertTrue("createNumber(String) 9b failed", 0xFADE == NumberUtils.createNumber("0Xfade").intValue());
        assertTrue("createNumber(String) 10a failed", -0xFADE == NumberUtils.createNumber("-0xFADE").intValue());
        assertTrue("createNumber(String) 10b failed", -0xFADE == NumberUtils.createNumber("-0Xfade").intValue());
        assertEquals("createNumber(String) 11 failed", Double.valueOf("1.1E200"), NumberUtils.createNumber("1.1E200"));
        assertEquals("createNumber(String) 12 failed", Float.valueOf("1.1E20"), NumberUtils.createNumber("1.1E20"));
        assertEquals("createNumber(String) 13 failed", Double.valueOf("-1.1E200"), NumberUtils.createNumber("-1.1E200"));
        assertEquals("createNumber(String) 14 failed", Double.valueOf("1.1E-200"), NumberUtils.createNumber("1.1E-200"));
        assertEquals("createNumber(null) failed", null, NumberUtils.createNumber(null));
        assertEquals("createNumber(String) failed", new BigInteger("12345678901234567890"), NumberUtils
                .createNumber("12345678901234567890L"));

        assertEquals("createNumber(String) 15 failed", new BigDecimal("1.1E-700"), NumberUtils
                    .createNumber("1.1E-700F"));

        assertEquals("createNumber(String) 16 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils
                .createNumber("10" + Integer.MAX_VALUE + "L"));
        assertEquals("createNumber(String) 17 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils
                .createNumber("10" + Integer.MAX_VALUE));
        assertEquals("createNumber(String) 18 failed", new BigInteger("10" + Long.MAX_VALUE), NumberUtils
                .createNumber("10" + Long.MAX_VALUE));

        // LANG-521
        assertEquals("createNumber(String) LANG-521 failed", Float.valueOf("2."), NumberUtils.createNumber("2."));

        // LANG-638
        assertFalse("createNumber(String) succeeded", checkCreateNumber("1eE"));

        // LANG-693
        assertEquals("createNumber(String) LANG-693 failed", Double.valueOf(Double.MAX_VALUE), NumberUtils
                    .createNumber("" + Double.MAX_VALUE));

        // LANG-822
        // ensure that the underlying negative number would create a BigDecimal
        final Number bigNum = NumberUtils.createNumber("-1.1E-700F");
        assertNotNull(bigNum);
        assertEquals(BigDecimal.class, bigNum.getClass());
    }


    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when preceeded by -- rather than -
    public void NumberUtils() {
        NumberUtils.createNumber("--1.1E-700F");
    }

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (with decimal)
    public void NumberUtils() {
        NumberUtils.createNumber("-1.1E+0-7e00");
    }

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (no decimal)
    public void NumberUtils() {
        NumberUtils.createNumber("-11E+0-7e00");
    }

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (no decimal)
    public void NumberUtils() {
        NumberUtils.createNumber("1eE+00001");
    }

    // Tests to show when magnitude causes switch to next Number type
    // Will probably need to be adjusted if code is changed to check precision (LANG-693)
    @Test
    public void NumberUtils() {
        // Test Float.MAX_VALUE, and same with +1 in final digit to check conversion changes to next Number type
        assertEquals(Float.valueOf(Float.MAX_VALUE),  NumberUtils.createNumber("3.4028235e+38"));
        assertEquals(Double.valueOf(3.4028236e+38),   NumberUtils.createNumber("3.4028236e+38"));

        // Test Double.MAX_VALUE
        assertEquals(Double.valueOf(Double.MAX_VALUE),          NumberUtils.createNumber("1.7976931348623157e+308"));
        // Test with +2 in final digit (+1 does not cause roll-over to BigDecimal)
        assertEquals(new BigDecimal("1.7976931348623159e+308"), NumberUtils.createNumber("1.7976931348623159e+308"));

        assertEquals(Integer.valueOf(0x12345678), NumberUtils.createNumber("0x12345678"));
        assertEquals(Long.valueOf(0x123456789L),  NumberUtils.createNumber("0x123456789"));

        assertEquals(Long.valueOf(0x7fffffffffffffffL),      NumberUtils.createNumber("0x7fffffffffffffff"));
        // Does not appear to be a way to create a literal BigInteger of this magnitude
        assertEquals(new BigInteger("7fffffffffffffff0",16), NumberUtils.createNumber("0x7fffffffffffffff0"));

        assertEquals(Long.valueOf(0x7fffffffffffffffL),      NumberUtils.createNumber("#7fffffffffffffff"));
        assertEquals(new BigInteger("7fffffffffffffff0",16), NumberUtils.createNumber("#7fffffffffffffff0"));

        assertEquals(Integer.valueOf(017777777777), NumberUtils.createNumber("017777777777")); // 31 bits
        assertEquals(Long.valueOf(037777777777L),   NumberUtils.createNumber("037777777777")); // 32 bits

        assertEquals(Long.valueOf(0777777777777777777777L),      NumberUtils.createNumber("0777777777777777777777")); // 63 bits
        assertEquals(new BigInteger("1777777777777777777777",8), NumberUtils.createNumber("01777777777777777777777"));// 64 bits
    }

    @Test
    public void NumberUtils() {
        assertEquals("createFloat(String) failed", Float.valueOf("1234.5"), NumberUtils.createFloat("1234.5"));
        assertEquals("createFloat(null) failed", null, NumberUtils.createFloat(null));
        this.testCreateFloatFailure("");
        this.testCreateFloatFailure(" ");
        this.testCreateFloatFailure("\b\t\n\f\r");
        // Funky whitespaces
        this.testCreateFloatFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F");
    }

    protected void testCreateFloatFailure(final String str) {
        try {
            final Float value = NumberUtils.createFloat(str);
            fail("createFloat(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    @Test
    public void NumberUtils() {
        assertEquals("createDouble(String) failed", Double.valueOf("1234.5"), NumberUtils.createDouble("1234.5"));
        assertEquals("createDouble(null) failed", null, NumberUtils.createDouble(null));
        this.testCreateDoubleFailure("");
        this.testCreateDoubleFailure(" ");
        this.testCreateDoubleFailure("\b\t\n\f\r");
        // Funky whitespaces
        this.testCreateDoubleFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F");
    }

    protected void testCreateDoubleFailure(final String str) {
        try {
            final Double value = NumberUtils.createDouble(str);
            fail("createDouble(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    @Test
    public void NumberUtils() {
        assertEquals("createInteger(String) failed", Integer.valueOf("12345"), NumberUtils.createInteger("12345"));
        assertEquals("createInteger(null) failed", null, NumberUtils.createInteger(null));
        this.testCreateIntegerFailure("");
        this.testCreateIntegerFailure(" ");
        this.testCreateIntegerFailure("\b\t\n\f\r");
        // Funky whitespaces
        this.testCreateIntegerFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F");
    }

    protected void testCreateIntegerFailure(final String str) {
        try {
            final Integer value = NumberUtils.createInteger(str);
            fail("createInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    @Test
    public void NumberUtils() {
        assertEquals("createLong(String) failed", Long.valueOf("12345"), NumberUtils.createLong("12345"));
        assertEquals("createLong(null) failed", null, NumberUtils.createLong(null));
        this.testCreateLongFailure("");
        this.testCreateLongFailure(" ");
        this.testCreateLongFailure("\b\t\n\f\r");
        // Funky whitespaces
        this.testCreateLongFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F");
    }

    protected void testCreateLongFailure(final String str) {
        try {
            final Long value = NumberUtils.createLong(str);
            fail("createLong(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    @Test
    public void NumberUtils() {
        assertEquals("createBigInteger(String) failed", new BigInteger("12345"), NumberUtils.createBigInteger("12345"));
        assertEquals("createBigInteger(null) failed", null, NumberUtils.createBigInteger(null));
        this.testCreateBigIntegerFailure("");
        this.testCreateBigIntegerFailure(" ");
        this.testCreateBigIntegerFailure("\b\t\n\f\r");
        // Funky whitespaces
        this.testCreateBigIntegerFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F");
        assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("0xff"));
        assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("#ff"));
        assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0xff"));
        assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("0377"));
        assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0377"));
        assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0377"));
        assertEquals("createBigInteger(String) failed", new BigInteger("-0"), NumberUtils.createBigInteger("-0"));
        assertEquals("createBigInteger(String) failed", new BigInteger("0"), NumberUtils.createBigInteger("0"));
        testCreateBigIntegerFailure("#");
        testCreateBigIntegerFailure("-#");
        testCreateBigIntegerFailure("0x");
        testCreateBigIntegerFailure("-0x");
    }

    protected void testCreateBigIntegerFailure(final String str) {
        try {
            final BigInteger value = NumberUtils.createBigInteger(str);
            fail("createBigInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    @Test
    public void NumberUtils() {
        assertEquals("createBigDecimal(String) failed", new BigDecimal("1234.5"), NumberUtils.createBigDecimal("1234.5"));
        assertEquals("createBigDecimal(null) failed", null, NumberUtils.createBigDecimal(null));
        this.testCreateBigDecimalFailure("");
        this.testCreateBigDecimalFailure(" ");
        this.testCreateBigDecimalFailure("\b\t\n\f\r");
        // Funky whitespaces
        this.testCreateBigDecimalFailure("\u00A0\uFEFF\u000B\u000C\u001C\u001D\u001E\u001F");
        this.testCreateBigDecimalFailure("-"); // sign alone not valid
        this.testCreateBigDecimalFailure("--"); // comment in NumberUtils suggests some implementations may incorrectly allow this
        this.testCreateBigDecimalFailure("--0");
        this.testCreateBigDecimalFailure("+"); // sign alone not valid
        this.testCreateBigDecimalFailure("++"); // in case this was also allowed by some JVMs
        this.testCreateBigDecimalFailure("++0");
    }

    protected void testCreateBigDecimalFailure(final String str) {
        try {
            final BigDecimal value = NumberUtils.createBigDecimal(str);
            fail("createBigDecimal(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    // min/max tests
    // ----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "min(long[]) failed for array length 1",
            5,
            NumberUtils.min(new long[] { 5 }));

        assertEquals(
            "min(long[]) failed for array length 2",
            6,
            NumberUtils.min(new long[] { 6, 9 }));

        assertEquals(-10, NumberUtils.min(new long[] { -10, -5, 0, 5, 10 }));
        assertEquals(-10, NumberUtils.min(new long[] { -5, 0, -10, 5, 10 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "min(int[]) failed for array length 1",
            5,
            NumberUtils.min(new int[] { 5 }));

        assertEquals(
            "min(int[]) failed for array length 2",
            6,
            NumberUtils.min(new int[] { 6, 9 }));

        assertEquals(-10, NumberUtils.min(new int[] { -10, -5, 0, 5, 10 }));
        assertEquals(-10, NumberUtils.min(new int[] { -5, 0, -10, 5, 10 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "min(short[]) failed for array length 1",
            5,
            NumberUtils.min(new short[] { 5 }));

        assertEquals(
            "min(short[]) failed for array length 2",
            6,
            NumberUtils.min(new short[] { 6, 9 }));

        assertEquals(-10, NumberUtils.min(new short[] { -10, -5, 0, 5, 10 }));
        assertEquals(-10, NumberUtils.min(new short[] { -5, 0, -10, 5, 10 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "min(byte[]) failed for array length 1",
            5,
            NumberUtils.min(new byte[] { 5 }));

        assertEquals(
            "min(byte[]) failed for array length 2",
            6,
            NumberUtils.min(new byte[] { 6, 9 }));

        assertEquals(-10, NumberUtils.min(new byte[] { -10, -5, 0, 5, 10 }));
        assertEquals(-10, NumberUtils.min(new byte[] { -5, 0, -10, 5, 10 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "min(double[]) failed for array length 1",
            5.12,
            NumberUtils.min(new double[] { 5.12 }),
            0);

        assertEquals(
            "min(double[]) failed for array length 2",
            6.23,
            NumberUtils.min(new double[] { 6.23, 9.34 }),
            0);

        assertEquals(
            "min(double[]) failed for array length 5",
            -10.45,
            NumberUtils.min(new double[] { -10.45, -5.56, 0, 5.67, 10.78 }),
            0);
        assertEquals(-10, NumberUtils.min(new double[] { -10, -5, 0, 5, 10 }), 0.0001);
        assertEquals(-10, NumberUtils.min(new double[] { -5, 0, -10, 5, 10 }), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "min(float[]) failed for array length 1",
            5.9f,
            NumberUtils.min(new float[] { 5.9f }),
            0);

        assertEquals(
            "min(float[]) failed for array length 2",
            6.8f,
            NumberUtils.min(new float[] { 6.8f, 9.7f }),
            0);

        assertEquals(
            "min(float[]) failed for array length 5",
            -10.6f,
            NumberUtils.min(new float[] { -10.6f, -5.5f, 0, 5.4f, 10.3f }),
            0);
        assertEquals(-10, NumberUtils.min(new float[] { -10, -5, 0, 5, 10 }), 0.0001f);
        assertEquals(-10, NumberUtils.min(new float[] { -5, 0, -10, 5, 10 }), 0.0001f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberUtils() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void NumberUtils() {
        assertEquals(
            "max(long[]) failed for array length 1",
            5,
            NumberUtils.max(new long[] { 5 }));

        assertEquals(
            "max(long[]) failed for array length 2",
            9,
            NumberUtils.max(new long[] { 6, 9 }));

        assertEquals(
            "max(long[]) failed for array length 5",
            10,
            NumberUtils.max(new long[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new long[] { -10, -5, 0, 5, 10 }));
        assertEquals(10, NumberUtils.max(new long[] { -5, 0, 10, 5, -10 }));
    }



}
