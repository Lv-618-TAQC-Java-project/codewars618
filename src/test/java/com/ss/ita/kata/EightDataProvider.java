package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderClass {

    @DataProvider(name = "validVolumeOfCuboidDataProvider")
    public static Object[][] validVolumeOfCuboidDataProvider() {
        Object[][] param = new Object[][]{
                {5, 5, 5, 125},
                {555, 555, 555, 170953875},
                {99, 99, 99, 970299}
        };
        return combine(eightImplPackageProvider(), param);
    }


    @DataProvider(name = "invalidVolumeOfCuboidDataProvider")
    public static Object[][] invalidVolumeOfCuboidDataProvider() {
        Object[][] param = new Object[][]{
                {0, 0, 0, -1},
                {-1, 5, 5, -1}
        };
        return combine(eightImplPackageProvider(), param);
    }

    @DataProvider(name = "convertAStringToaNumber")
    public static Object[][]convertAStringToANumber(){
        Object[][] param = new Object[][]{
                {"1234", 1234},
                {"605", 605},
                {"1405", 1405},
                {"-7", -7}
        };
        return combine(eightImplPackageProvider(), param);
    }

}
