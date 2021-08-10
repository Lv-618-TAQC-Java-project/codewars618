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






//    @DataProvider(name = "validVolumeOfCuboidDataProviderTemp")
//    public static Object[][] validVolumeOfCuboidDataProviderTemp() {
//        return new Object[][]{
//                {new com.ss.ita.kata.implementation.ivannaveselovska.EightImpl(), 5, 5, 5, 125},
//                {new com.ss.ita.kata.implementation.ivannaveselovska.EightImpl(), 555, 555, 555, 170953875},
//                {new com.ss.ita.kata.implementation.ivannaveselovska.EightImpl(), 99, 99, 99, 970299},
//                {new com.ss.ita.kata.implementation.kubrub.EightImpl(), 5, 5, 5, 125},
//                {new com.ss.ita.kata.implementation.maxde1.EightImpl(), 555, 555, 555, 170953875},
//                {new com.ss.ita.kata.implementation.msemochko.EightImpl(), 99, 99, 99, 970299}
//        };
//    }
}
