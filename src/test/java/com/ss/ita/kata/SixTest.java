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

    @Test(dataProvider = "validNbaCupDataProvider")
    public void testNbaCup(Six imp,String resultSheet,String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }
    @Test(dataProvider = "inValidNbaCupDataProvider")
    public void NegativeTestNbaCup(Six imp,String resultSheet,String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }

    @Test
    public void testStockSummary() {
    }
}