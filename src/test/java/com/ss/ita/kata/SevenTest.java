package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SevenTest extends SevenDataProvider{

    @Test
    public void testNewAvg() {
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