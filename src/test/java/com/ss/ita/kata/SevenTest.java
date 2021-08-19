package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SevenTest extends SevenDataProvider {


    @Test(dataProvider = "positiveLookingForABenefactor")
    public void positiveTestLookingForABenefactor(Seven imp, double[] arr, double navg, long expected) {
        Assert.assertEquals(imp.newAvg(arr, navg), expected);
    }

    @Test(dataProvider = "validSeriesSum")
    public void validTestSeriesSum(Seven imp, int n, String expected) {
        Assert.assertEquals(imp.seriesSum(n), expected);
    }

    @Test(dataProvider = "invalidSeriesSum")
    public void invalidTestSeriesSum(Seven imp, int n, String expected) {
        Assert.assertEquals(imp.seriesSum(n), expected);
    }

    @Test(dataProvider = "negativeLookingForABenefactor", expectedExceptions = Exception.class)
    public void negativeTestLookingForABenefactor(Seven imp, double[] arr, double navg) throws IOException {
        imp.newAvg(arr, navg);
    }

    @Test
    public void testSeriesSum() {
    }

    @Test(dataProvider = "positiveWhereIsHe")
    public void positiveTestWhereIsHe(Seven imp, int a, int b, int c, int expected) {
        Assert.assertEquals(imp.whereIsHe(a, b, c), expected);
    }

    @Test(dataProvider = "negativeWhereIsHe")
    public void negativeTestWhereIsHe(Seven imp, int a, int b, int c, int expected){
        Assert.assertEquals(imp.whereIsHe(a, b, c), expected);
    }
}