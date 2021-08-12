package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderClass{
    @DataProvider(name = "findTheSmallest")
    public static Object[][] findTheSmallest(){
        Object[][] param = new Object[][]{
                {261235, "[126235, 2, 0]"},
                {285365, "[238565, 3, 1]"},
                {269045, "[26945, 3, 0]"},
                {296837, "[239687, 4, 1]"}
        };
        return combine(fiveImplPackageProvider(), param);
    }
    @DataProvider(name = "invalidFindTheSmallest")
    public static Object[][] invalidFindTheSmallest(){
        Object[][] param = new Object[][]{
                {-261235, "[]"},
                {-285365, "[]"},
                {-269045, "[]"},
                {-296837, "[]"}
        };
        return combine(fiveImplPackageProvider(), param);
    }
}
