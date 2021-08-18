package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends SixDataProvider{

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

    @Test
    public void testF() {
    }

    @Test
    public void testMean() {
    }

    @Test
    public void testVariance() {
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