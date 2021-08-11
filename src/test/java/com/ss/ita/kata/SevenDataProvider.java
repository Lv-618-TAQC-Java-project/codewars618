package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderClass {

    @DataProvider(name = "validSeriesSum")
    public static Object[][] validSeriesSum() {
        Object[][] param = new Object[][]{
                {5, "1.57"},
                {9, "1.77"},
                {15, "1.94"}
        };
        return combine(sevenImplPackageProvider(), param);
    }

    @DataProvider(name = "invalidSeriesSum")
    public static Object[][] invalidSeriesSum() {
        Object[][] param = new Object[][]{
                {0, "0.00"},
                {-1, "0.00"}
        };
        return combine(sevenImplPackageProvider(), param);
    }
}
