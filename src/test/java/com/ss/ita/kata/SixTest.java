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

    @Test(dataProvider = "validFloatingPointApproximation")
    public void testF(Six imp, double x, double expected) {
        Assert.assertEquals(imp.f(x),expected);
    }

    @Test(dataProvider = "invalidFloatingPointApproximation")
    public void invalidTestF(Six imp, double x, double expected) {
        Assert.assertEquals(imp.f(x),expected);
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

    @Test
    public void testStockSummary() {
    }
}