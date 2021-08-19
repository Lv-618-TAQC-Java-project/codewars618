package com.ss.ita.kata;

import com.ss.ita.kata.implementation.vmuravskyi.EightImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest extends EightDataProvider {

    @Test(dataProvider = "positiveLiters")
    public void positiveTestLiters(Eight imp, double time, int expected) {
        Assert.assertEquals(imp.liters(time), expected);
    }
    @Test(dataProvider = "negativeLiters")
    public void negativeTestKeepLiters(Eight imp, double time, int expected) {
        Assert.assertEquals(imp.liters(time), expected);
    }

    @Test(dataProvider = "validVolumeOfCuboidDataProvider")
    public void TestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }

    @Test(dataProvider = "invalidVolumeOfCuboidDataProvider")
    public void NegativeTestGetVolumeOfCuboid(Eight imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }


    @Test(dataProvider = "positiveMpgToKPM")
    public void positiveTestMpgToKPM(Eight imp, float a, float expected) {
        Assert.assertEquals(imp.mpgToKPM(a), expected);
    }

    @Test(dataProvider = "negativeMpgToKPM")
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

    @Test(dataProvider = "convertAStringToaNumber")
    public void testStringToNumber(Eight imp, String str, int expected) {
        Assert.assertEquals(imp.stringToNumber(str), expected);
    }

    @Test(dataProvider = "wilsonPrimeDataProvider")
    public void testAmIWilson(Eight impl, double n, boolean expected) {
        Assert.assertEquals(impl.amIWilson(n), expected);
    }

    @Test(dataProvider = "invalidWilsonPrimeDataProvider")
    public void invalidTestAmIWilson(Eight impl, double n, boolean expected) {
        Assert.assertEquals(impl.amIWilson(n), expected);
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