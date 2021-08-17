package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class ConsoleScannerDataProvider extends DataProviderClass {

    @DataProvider(name = "validConsoleScanner")
    public static Object[][] validConsoleScanner() {
        Object[][] param = {
                {1, 2, 3, 4, 5},
                {123, 234, 345, 456, 567}
        };
        return combine(ConsoleScannerProvider(), param);
    }

    @DataProvider(name = "invalidConsoleScanner")
    public static Object[][] invalidConsoleScanner() {
        Object[][] param = {
                {1, 2, 3, "qwe", 5, new String("Value qwe is not Double, please try again.")},
                {123, "a", 345, 456, new String("Value a is not Double, please try again.")}
        };
        return combine(ConsoleScannerProvider(), param);
    }
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
