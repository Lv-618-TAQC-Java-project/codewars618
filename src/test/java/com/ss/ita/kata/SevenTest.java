package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider {

    @Test
    public void testNewAvg() {
    }

    @Test(dataProvider = "validSeriesSum")
    public void validTestSeriesSum(Seven imp, int n, String expected) {
        Assert.assertEquals(imp.seriesSum(n), expected);
    }

    @Test(dataProvider = "invalidSeriesSum")
    public void invalidTestSeriesSum(Seven imp, int n, String expected) {
        Assert.assertEquals(imp.seriesSum(n), expected);
    }

    @Test
    public void testWhereIsHe() {
    }
}