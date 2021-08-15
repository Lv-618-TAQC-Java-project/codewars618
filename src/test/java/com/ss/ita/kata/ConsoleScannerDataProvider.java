package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class ConsoleScannerDataProvider extends DataProviderClass {

    @DataProvider(name = "validReadDouble")
    public static Object[][] validReadDouble() {
        Object[][] testData = new Object[][]{
                {"431,24", 431.24},
                {"151,21", 151.21},
                {"0,0", 0.0},
                {"-152,14", -152.14},
        };
        return testData;
    }

    @DataProvider(name = "invalidReadDouble")
    public static Object[][] invalidReadDouble() {
        Object[][] testData = new Object[][]{
                {"12525",new String("Value is not 'double', please try again")},
                {"-125125124",new String("Value is not 'double', please try again")},
        };
        return testData;
    }
}