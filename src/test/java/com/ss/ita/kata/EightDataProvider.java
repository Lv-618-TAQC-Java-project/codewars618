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
    @DataProvider(name = "positiveKeepHydrated")
    public static Object[][] positiveKeepHydrated(){
        Object[][] testData = new Object[][]{
                {4.0, 2},
                {11.0, 5},
                {200.0, 100},
                {25355354.0, 12677677},
                {0,0},
                {1,0},
                {0.5,0},
                {199.8, 99}
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeKeepHydrated")
    public static Object[][] negativeKeepHydrated(){
        Object[][] testData = new Object[][]{
                {-50, -25},
                {-400000, -200000}
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "positiveMpgToKPM")
    public static Object[][] positiveMpgToKPM(){
        Object[][] testData = new Object[][]{
                {10f, 3.54f},
                {20f, 7.08f},
                {0f, 0f}
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "negativeMpgToKPM")
    public static Object[][] negativeMpgToKPM(){
        Object[][] testData = new Object[][]{
                {-5f, 0},
                {-9879.324f, 0}
        };
        return combine(eightImplPackageProvider(), testData);
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