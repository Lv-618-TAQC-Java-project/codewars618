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

    @DataProvider(name = "positiveLookingForABenefactor")
    public static Object[][] positiveLookingForABenefactor(){
        Object[][] testData = new Object[][]{
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0}, 30.0, 149},
                {new double[]{4.0, 5.0}, 20.0, 51},
                {new double[]{1455.0, 5000.0, 5.0, 5500.0, 9.0, 11.0, 156.0},5000.0, 27864},
                {new double[]{1}, 1, 1},
        };
        return combine(sevenImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeLookingForABenefactor")
    public static Object[][] negativeLookingForABenefactor(){
        Object[][] testData = new Object[][]{
                {new double[]{1000000000000002442.0, 24225522252552.0, 245242552252525.0, 2425224532532532.0}, 0},
                {new double[]{12.0, 25.0, 60.0}, -1},
                {new double[]{0.0}, 0.0}
        };
        return combine(sevenImplPackageProvider(), testData);
    }

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
