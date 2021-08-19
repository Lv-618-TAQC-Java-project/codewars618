package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.math.BigInteger;

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

    @Test(dataProvider = "positiveZeros")
    public void positiveTestZeros(Five imp, int a, int expected) {
        Assert.assertEquals(imp.zeros(a), expected);
    }

    @Test(dataProvider = "negativeZeros")
    public void negativeTestZeros(Five imp, int a, int expected) {
        Assert.assertEquals(imp.zeros(a), expected);
    }

    @Test(dataProvider = "positivePerimeter")
    public void positiveTestPerimeter(Five impl, BigInteger actual, BigInteger expected) {
        Assert.assertEquals(impl.perimeter(actual), expected);
    }
    @Test(dataProvider = "negativePerimeter")
    public void negativeTestPerimeter(Five impl, BigInteger actual, BigInteger expected) {
        Assert.assertEquals(impl.perimeter(actual), expected);
    }

    @Test
    public void testSolveSum() {
    }

    @Test(dataProvider = "findTheSmallest")
    public void testSmallest(Five imp, long n, String res) {
        Assert.assertEquals(Arrays.toString(imp.smallest(n)), res);
    }

    @Test(dataProvider = "invalidFindTheSmallest")
    public void negativeTestSmallest(Five imp, long n, String res){
        Assert.assertEquals(Arrays.toString(imp.smallest(n)), res);
    }

}