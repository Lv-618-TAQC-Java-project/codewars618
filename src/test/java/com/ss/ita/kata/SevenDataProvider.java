package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderClass{
    @DataProvider(name = "positiveWhereIsVasya")
    public static Object[][] positiveWhereIsVasya(){
        Object[][] testData = new Object[][]{
                {3, 1, 1, 2},
                {5, 2, 3, 3},
                {6, 2, 3, 4}
        };
        return combine(sevenImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeWhereIsVasya")
    public static Object[][] negativeWhereIsVasya(){
        Object[][] testData = new Object[][]{
                {-5, -1, 0, 0},
                {2, 5, 3, 0},
                {-111, 50, 50, 0}
        };
        return combine(sevenImplPackageProvider(), testData);
    }
}
