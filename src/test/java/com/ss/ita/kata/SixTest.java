package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class SixTest extends SixDataProvider {


    @Test(dataProvider = "positiveFindNb")
    public void positiveTestFindNb(Six impl, long actual, long expected) {
        Assert.assertEquals(impl.findNb(actual),expected);
    }
    @Test(dataProvider = "negativeFindNb")
    public void negativeTestFindNb(Six impl, long actual, long expected) {
        Assert.assertEquals(impl.findNb(actual),expected);
    }

    @Test
    public void testBalance() {
    }

    @Test(dataProvider = "validFloatingPointApproximation")
    public void testF(Six imp, double x, double expected) {
        Assert.assertEquals(imp.f(x),expected);
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

    @Test(dataProvider = "validNbaCupDataProvider")
    public void testNbaCup(Six imp,String resultSheet,String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }
    @Test(dataProvider = "inValidNbaCupDataProvider")
    public void NegativeTestNbaCup(Six imp,String resultSheet,String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }

    @Test(dataProvider = "validHelpBooksellerDataProvider")
    public void testStockSummary(Six imp,String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
    @Test(dataProvider = "invalidHelpBooksellerDataProvider")
    public void testStockSummaryInvalid(Six imp,String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
}