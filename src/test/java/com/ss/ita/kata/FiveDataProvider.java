package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderClass {

    @DataProvider(name = "validGap")
    public static Object[][] validGap() {
        Object[][] param = {
                {2, 100, 110, new long[]{101, 103}},
                {4, 100, 110, new long[]{103, 107}},
                {8, 300, 400, new long[]{359, 367}},
                {10, 300, 400, new long[]{337, 347}}
        };
        return combine(fiveImplPackageProvider(), param);
    }

    @DataProvider(name = "invalidGap")
    public static Object[][] invalidGap() {
        Object[][] param = {
                {6, 100, 110, null},
        };
        return combine(fiveImplPackageProvider(), param);
    }
}