package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class FiveDataProvider extends DataProviderClass {

    @DataProvider(name = "validGap")
    public static Object[][] validGap() {
        Object[][] param = {
                {2, 100, 110, new long[]{101, 103}},
                {4, 100, 110, new long[]{103, 107}},
                {8, 300, 400, new long[]{359, 367}},
                {10, 300, 400, new long[]{337, 347}}
        };
        return combine(fiveImplPackageProvider(), param);
    }

    @DataProvider(name = "positiveArtificialRain")
    public static Object[][] positiveArtificialRain(){
        Object[][] testData = new Object[][]{
                {new int[]{1,2,1,2,1}, 3},
                {new int[]{0}, 1},
                {new int[]{9,5,4,3,8}, 4},
                {new int[]{1,1,1,1}, 4},
                {new int[]{0,0,0,0},4},
                {new int[]{12,13,11,10},4},
                {new int[]{},0}
        };
        return combine(fiveImplPackageProvider(), testData);
    }


    @DataProvider(name = "invalidGap")
    public static Object[][] invalidGap() {
        Object[][] param = {
                {6, 100, 110, null},
        };
        return combine(fiveImplPackageProvider(), param);
    }

    @DataProvider()
    public static Object[][] positivePerimeter() {
        Object[][] testData = {
                {BigInteger.valueOf(5), BigInteger.valueOf(80)},
                {BigInteger.valueOf(7), BigInteger.valueOf(216)},
                {BigInteger.valueOf(30), BigInteger.valueOf(14098308)}
        };
        return combine(fiveImplPackageProvider(), testData);
    }
    @DataProvider()
    public static Object[][] negativePerimeter() {
        Object[][] testData = {
                {BigInteger.valueOf(0), BigInteger.valueOf(0)},
                {BigInteger.valueOf(-15), BigInteger.valueOf(0)}
        };
        return combine(fiveImplPackageProvider(), testData);
    }
}