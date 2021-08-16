package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiveTest extends FiveDataProvider {

    @Test(dataProvider = "positiveArtificialRain")
    public void positiveTestArtificialRain(Five imp, final int[] arr, int expected) {
        Assert.assertEquals(imp.artificialRain(arr), expected);
    }

    @Test(dataProvider = "validGap")
    public void testValidGap(Five imp, int g, long m, long n, long[] expected) {
        Assert.assertEquals(imp.gap(g, m, n), expected);
    }

    @Test(dataProvider = "invalidGap")
    public void testInvalidGap(Five imp, int g, long m, long n, long[] expected) {
        Assert.assertEquals(imp.gap(g, m, n), expected);
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}