package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderClass{

    @DataProvider(name = "positiveLookingForABenefactor")
    public static Object[][] positiveLookingForABenefactor(){
        Object[][] testData = new Object[][]{
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0}, 30.0, 149},
                {new double[]{4.0, 5.0}, 20.0, 51},
                {new double[]{1455.0, 5000.0, 5.0, 5500.0, 9.0, 11.0, 156.0},5000.0, 27864},
                {new double[]{0.0}, 0.0, 0},
                {new double[]{1}, 1, 1},
        };
        return combine(sevenImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeLookingForABenefactor")
    public static Object[][] negativeLookingForABenefactor(){
        Object[][] testData = new Object[][]{
                {new double[]{1000000000000002442.0, 24225522252552.0, 245242552252525.0, 2425224532532532.0}, 0},
                {new double[]{12.0, 25.0, 60.0}, -1}
        };
        return combine(sevenImplPackageProvider(), testData);
    }
}
