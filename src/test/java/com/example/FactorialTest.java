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

    @Test
    public void testFactorialOf15() {
        assertEquals(1307674368000L, f.compute(15));
    }

    @Test
    public void testFactorialOf16() {
        assertEquals(20922789888000L, f.compute(16));
    }

    @Test
    public void testFactorialOf17() {
        assertEquals(355687428096000L, f.compute(17));
    }

    @Test
    public void testFactorialOf18() {
        assertEquals(6402373705728000L, f.compute(18));
    }

    @Test
    public void testFactorialOf19() {
        assertEquals(121645100408832000L, f.compute(19));
    }

    @Test
    public void testFactorialOf20() {
        assertEquals(2432902008176640000L, f.compute(20));
    }

    @Test
    public void testFactorialOf21() {
        assertEquals(51090942171709440000L, f.compute(21));
    }

    @Test
    public void testFactorialOf22() {
        assertEquals(1124000727777607680000L, f.compute(22));
    }

    @Test
    public void testFactorialOf23() {
        assertEquals(25852016738884976640000L, f.compute(23));
    }

    @Test
    public void testFactorialOf24() {
        assertEquals(620448401733239439360000L, f.compute(24));
    }

    @Test
    public void testFactorialOf25() {
        assertEquals(15511210043330985984000000L, f.compute(25));
    }

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

    @Test
    public void testFactorialOf18Random() {
        assertEquals(6402373705728000L, f.compute(18));
    }

    @Test
    public void testFactorialOf22Random() {
        assertEquals(1124000727777607680000L, f.compute(22));
    }

    @Test
    public void testFactorialOf17Random() {
        assertEquals(355687428096000L, f.compute(17));
    }

    @Test
    public void testFactorialOf5Random() {
        assertEquals(120L, f.compute(5));
    }

    @Test
    public void testFactorialOf2Random() {
        assertEquals(2L, f.compute(2));
    }

    @Test
    public void testFactorialOf13Random() {
        assertEquals(6227020800L, f.compute(13));
    }

    @Test
    public void testFactorialOf7Random() {
        assertEquals(5040L, f.compute(7));
    }

    @Test
    public void testFactorialOf14Random() {
        assertEquals(87178291200L, f.compute(14));
    }

    @Test
    public void testFactorialOf9Random() {
        assertEquals(362880L, f.compute(9));
    }

    @Test
    public void testFactorialOf16Random() {
        assertEquals(20922789888000L, f.compute(16));
    }

    @Test
    public void testFactorialOf19Random() {
        assertEquals(121645100408832000L, f.compute(19));
    }

    @Test
    public void testFactorialOf20Random() {
        assertEquals(2432902008176640000L, f.compute(20));
    }

    // Invalid inputs
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
