package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EightTest extends EightDataProvider {

    @Test
    public void testLiters() {
    }

    @Test(dataProvider = "validVolumeOfCuboidDataProvider")
    public void TestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }

    @Test(dataProvider = "invalidVolumeOfCuboidDataProvider")
    public void NegativeTestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }


    @Test
    public void testMpgToKPM() {
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @Test
    public void testCountPositivesSumNegatives() {
    }

    @Test
    public void testStringToNumber() {
    }

    @Test
    public void testAmIWilson() {
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }
}