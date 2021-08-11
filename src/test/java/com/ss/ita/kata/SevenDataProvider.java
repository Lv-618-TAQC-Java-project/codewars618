package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderClass{
    @DataProvider(name = "positiveWhereIsHe")
    public static Object[][] positiveWhereIsHe(){
        Object[][] testData = new Object[][]{
                {3, 1, 1, 2},
                {5, 2, 3, 3},
                {6, 2, 3, 4}
        };
        return combine(sevenImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeWhereIsHe")
    public static Object[][] negativeWhereIsHe(){
        Object[][] testData = new Object[][]{
                {-5, -1, 0, 0},
                {2, 5, 3, 0},
                {-111, 50, 50, 0}
        };
        return combine(sevenImplPackageProvider(), testData);
    }
}
