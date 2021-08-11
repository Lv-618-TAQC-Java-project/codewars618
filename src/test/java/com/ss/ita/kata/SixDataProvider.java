package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SixDataProvider extends DataProviderClass{

    @DataProvider(name = "validHelpBooksellerDataProvider")
    public static Object[][] validHelpBooksellerDataProvider(){
        Object[][] testData = new Object[][]{
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},new String[] {"A", "B"},"(A : 200) - (B : 1140)"},
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},new String[] {""},""},
                {new String[]{""},new String[] {"A", "B"},""},
        };
        return combine(sixImplPackageProvider(), testData);
    }
    @DataProvider(name = "invalidHelpBooksellerDataProvider")
    public static Object[][] invalidHelpBooksellerDataProvider(){
        Object[][] testData = new Object[][]{
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},new String[] {"A", "B"},"(L : 3200) - (K : 1140)"},
                {new String[]{"FWD 234", "WAD 321", "WDA 100", "BTSQ 890", "YWD 214"},new String[] {"A", "B"},"(A : 200) - (B : 1140)"},
        };
        return combine(sixImplPackageProvider(), testData);
    }

}
