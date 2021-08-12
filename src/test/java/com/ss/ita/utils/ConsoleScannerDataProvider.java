package com.ss.ita.utils;

import com.ss.ita.kata.DataProviderClass;
import org.testng.annotations.DataProvider;

public class ConsoleScannerDataProvider extends DataProviderClass {
    @DataProvider(name = "positiveReadIntArray")
    public static Object[][] positiveReadIntArray(){
        Object[][] testData = new Object[][]{
                {"1 3 5 6 6", new int[]{1, 3, 5, 6, 6}},
                {"1 4343 2534 0000", new int[]{1, 4343, 2534, 0}},
                {"0", new int[]{0}},
                {" ", new int[]{}},
                {"0001 000002 000023", new int[]{1, 2, 23}}
        };
        return testData;
    }
    @DataProvider(name = "negativeReadIntArray")
    public static Object[][] negativeReadIntArray(){
        Object[][] testData = new Object[][]{
                {"1  1  2  4  5"},
                {"re1 433 t4353"},
                {"# 12% 0"},
                {"343_242_42_943"},
                {"1, 3, 5, 6"},
                {"1111111111111111111111111111111111222222222222"},
                {"\"1 2 4 5 6\""},
                {"\"1\", \"2\""}
        };
        return testData;
    }
}
