package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends SixDataProvider{

    @Test
    public void testFindNb() {
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

    @Test
    public void testNbaCup() {
    }

    @Test(dataProvider = "validHelpBooksellerDataProvider")
    public void testStockSummary(Six imp,String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
    @Test(dataProvider = "invalidHelpBooksellerDataProvider")
    public void testStockSummaryInvalid(Six imp,String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertNotEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
}