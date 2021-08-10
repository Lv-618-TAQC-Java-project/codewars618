package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends SixDataProvider {

    @Test
    public void testFindNb() {
    }

    @Test
    public void testBalance() {
    }

    @Test
    public void testF() {
    }

    @Test(dataProvider = "meanDataProvider")
    public void testMean(Six impl, String town, String data, double expected) {
        Assert.assertEquals(impl.mean(town, data), expected);
    }

    @Test(dataProvider = "invalidMeanDataProvider")
    public void invalidTestMean(Six impl, String town, String data, double expected) {
        Assert.assertEquals(impl.mean(town, data), expected);
    }

    @Test(dataProvider = "varianceDataProvider")
    public void testVariance(Six impl, String town, String data, double expected) {
        Assert.assertEquals(impl.variance(town, data), expected);
    }

    @Test(dataProvider = "invalidVarianceDataProvider")
    public void invalidTestVariance(Six impl, String town, String data, double expected) {
        Assert.assertEquals(impl.variance(town, data), expected);
    }

    @Test
    public void testNbaCup() {
    }

    @Test
    public void testStockSummary() {
    }
}