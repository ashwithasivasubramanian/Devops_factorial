package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    Factorial f = new Factorial();

    // Valid inputs
    @Test
    public void testFactorialOf0() {
        assertEquals(1L, f.compute(0));
    }

    @Test
    public void testFactorialOf1() {
        assertEquals(1L, f.compute(1));
    }

    @Test
    public void testFactorialOf2() {
        assertEquals(2L, f.compute(2));
    }

    @Test
    public void testFactorialOf3() {
        assertEquals(6L, f.compute(3));
    }

    @Test
    public void testFactorialOf4() {
        assertEquals(24L, f.compute(4));
    }

    @Test
    public void testFactorialOf5() {
        assertEquals(120L, f.compute(5));
    }

    @Test
    public void testFactorialOf6() {
        assertEquals(720L, f.compute(6));
    }

    @Test
    public void testFactorialOf7() {
        assertEquals(5040L, f.compute(7));
    }

    @Test
    public void testFactorialOf8() {
        assertEquals(40320L, f.compute(8));
    }

    @Test
    public void testFactorialOf9() {
        assertEquals(362880L, f.compute(9));
    }

    @Test
    public void testFactorialOf10() {
        assertEquals(3628800L, f.compute(10));
    }

    @Test
    public void testFactorialOf11() {
        assertEquals(39916800L, f.compute(11));
    }

    @Test
    public void testFactorialOf12() {
        assertEquals(479001600L, f.compute(12));
    }

    @Test
    public void testFactorialOf13() {
        assertEquals(6227020800L, f.compute(13));
    }

    @Test
    public void testFactorialOf14() {
        assertEquals(87178291200L, f.compute(14));
    }

    // Random inputs
    @Test
    public void testFactorialOf10Random() {
        assertEquals(3628800L, f.compute(10));
    }

    @Test
    public void testFactorialOf6Random() {
        assertEquals(720L, f.compute(6));
    }

    @Test
    public void testFactorialOf12Random() {
        assertEquals(479001600L, f.compute(12));
    }

    @Test
    public void testFactorialOf15Random() {
        assertEquals(1307674368000L, f.compute(15));
    }

    // Invalid inputs (negative cases)
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput1() {
        f.compute(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput2() {
        f.compute(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput3() {
        f.compute(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput4() {
        f.compute(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput5() {
        f.compute(-5);
    }
}
