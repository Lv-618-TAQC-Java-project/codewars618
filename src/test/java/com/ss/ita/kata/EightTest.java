package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest extends EightDataProvider {

    @Test(dataProvider = "positiveKeepHydrated")
    public void positiveTestKeepHydrated(Eight imp, double time, int expected) {
        Assert.assertEquals(imp.liters(time), expected);
    }
    @Test(dataProvider = "negativeKeepHydrated")
    public void negativeTestKeepHydrated(Eight imp, double time, int expected) {
        Assert.assertNotEquals(imp.liters(time), expected);
    }

    @Test(dataProvider = "validVolumeOfCuboidDataProvider")
    public void TestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }

    @Test(dataProvider = "invalidVolumeOfCuboidDataProvider")
    public void NegativeTestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }


    @Test(dataProvider = "positiveMphToKph")
    public void positiveTestMpgToKPM(Eight imp, float a, float expected) {
        Assert.assertEquals(imp.mpgToKPM(a), expected);
    }

    @Test(dataProvider = "negativeMphToKph")
    public void negativeTestMpgToKPM(Eight imp, float a, float expected) {
        Assert.assertEquals(imp.mpgToKPM(a), expected);
    }

    @Test(dataProvider = "positiveSquareOrSquareRoot")
    public void positiveTestSquareOrSquareRoot(Eight imp, int[] actual, int[] expected) {
        Assert.assertEquals(imp.squareOrSquareRoot(actual),expected);
    }

    @Test(dataProvider = "negativeSquareOrSquareRoot")
    public void negativeTestSquareOrSquareRoot(Eight imp, int[] actual, int[] expected) {
        Assert.assertEquals(imp.squareOrSquareRoot(actual),expected);
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

    @Test(dataProvider = "positiveTwoDecimalPlaces")
    public void positiveTestTwoDecimalPlaces(Eight imp, double number, double expected) {
        Assert.assertEquals(imp.twoDecimalPlaces(number), expected);
    }

    @Test(dataProvider = "negativeTwoDecimalPlaces")
    public void negativeTestTwoDecimalPlaces(Eight imp, double number, double expected) {
        Assert.assertEquals(imp.twoDecimalPlaces(number), expected);
    }

    @Test(dataProvider = "validDivisibleByDataProvider")
    public void testDivisibleBy(Eight imp, int[] numbers, int divider, int[] expected) {
        Assert.assertEquals(imp.divisibleBy(numbers, divider), expected);
    }

    @Test(dataProvider = "invalidDivisibleByDataProvider")
    public void testDivisibleByInvalid(Eight imp, int[] numbers, int divider, int[] expected) {
        Assert.assertNotEquals(imp.divisibleBy(numbers, divider), expected);
    }

    @Test(dataProvider = "negativeDivisibleByDataProvider")
    public void testDivisibleByNegative(Eight imp, int[] numbers, int divider, int[] expected) {
        Assert.assertEquals(imp.divisibleBy(numbers, divider), expected);
    }
}