package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FiveTest extends FiveDataProvider{

    @Test(dataProvider = "positiveArtificialRain")
    public void positiveTestArtificialRain(Five imp, final int[] arr, int expected) {
        Assert.assertEquals(imp.artificialRain(arr), expected);
    }

    @Test
    public void testGap() {
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}