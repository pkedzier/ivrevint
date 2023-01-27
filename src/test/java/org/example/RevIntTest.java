package org.example;


import org.junit.Assert;
import org.junit.Test;

public class RevIntTest {

    private RevInt rev = new RevInt();

    @Test
    public void shouldReversePositiveNumber() throws Throwable {
        Assert.assertEquals(12345, rev.reverse(54321));
    }
    @Test
    public void shouldReversePositiveNumberCase2() throws Throwable {
        Assert.assertEquals(1756, rev.reverse(6571));
    }

    @Test
    public void shouldReverseNegativeNumber() throws Throwable {
        Assert.assertEquals(-7008, rev.reverse(-8007));
    }

    @Test
    public void shouldReverse0() throws Throwable {
        Assert.assertEquals(0, rev.reverse(0));
    }


    /**
     * Overflow case (positive)
     */
    @Test
    public void shouldReturn0WhenOverflow() throws Throwable {
        Assert.assertEquals(0, rev.reverse(Integer.MAX_VALUE));
    }

    /**
     * Overflow case (negative)
     */
    @Test
    public void shouldReturn0WhenOverflowNegativeCase() throws Throwable {
        Assert.assertEquals(0, rev.reverse(Integer.MIN_VALUE));
    }
}
