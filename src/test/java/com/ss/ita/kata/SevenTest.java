package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class SevenTest extends SevenDataProvider{

    @Test(dataProvider = "positiveLookingForABenefactor")
    public void positiveTestLookingForABenefactor(Seven imp, double[] arr, double navg, long expected) {
        Assert.assertEquals(imp.newAvg(arr,navg), expected);
    }
    @Test(dataProvider = "negativeLookingForABenefactor", expectedExceptions = Exception.class)
    public void negativeTestLookingForABenefactor(Seven imp, double[] arr, double navg)throws IOException {
        imp.newAvg(arr, navg);
    }
    @Test
    public void testSeriesSum() {
    }

    @Test
    public void testWhereIsHe() {
    }
}