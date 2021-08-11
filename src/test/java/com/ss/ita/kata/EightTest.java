package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest extends EightDataProvider {

    @Test(dataProvider = "positiveKeepHydrated")
    public void PositiveTestKeepHydrated(Eight imp, double time, int expected) {
        Assert.assertEquals(imp.liters(time), expected);
    }
    @Test(dataProvider = "negativeKeepHydrated")
    public void NegativeTestKeepHydrated(Eight imp, double time, int expected) {
        Assert.assertNotEquals(imp.liters(time), expected);
    }

    @Test(dataProvider = "validVolumeOfCuboidDataProvider")
    public void TestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a,b,c), expected);

    }

    @Test(dataProvider = "invalidVolumeOfCuboidDataProvider")
    public void NegativeTestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a,b,c), expected);
    }

    @Test(dataProvider = "eightImplPackageProvider")
    public void negativeTestGetVolumeOfCuboid() {
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

    @Test(dataProvider = "validDivisibleByDataProvider")
    public void testDivisibleBy(Eight imp,int[] numbers,int divider,int[] expected) {
        Assert.assertEquals(imp.divisibleBy(numbers,divider), expected);
    }
}