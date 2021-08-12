package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SixDataProvider extends DataProviderClass{
    @DataProvider(name="validFloatingPointApproximation")
    public static Object[][] validFloatingPointApproximation(){
        Object[][] param = new Object[][]{
                {2.6e-08, 1.29999999155e-08},
                {1.4e-09, 6.999999997549999e-10},
                {2.4e-07, 1.1999999280000085e-07}
        };
        return combine(sixImplPackageProvider(), param);
    }
    @DataProvider(name="invalidFloatingPointApproximation")
    public static Object[][] invalidFloatingPointApproximation(){
        Object[][] param = new Object[][]{
                {-2.4, -1},
                {-1.7, -1},
                {-2.4e-07, -1},
                {-2, -1},
                {-1.4e-09, -1},
                {-2.6e-08, -1},
        };
        return combine(sixImplPackageProvider(), param);
    }
}
