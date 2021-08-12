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
                {0, 0, 0, 0},
                {-1, 5, 5, 0}
        };
        return combine(eightImplPackageProvider(), param);
    }

    @DataProvider(name = "positiveKeepHydrated")
    public static Object[][] positiveKeepHydrated() {
        Object[][] testData = new Object[][]{
                {4.0, 2},
                {11.0, 5},
                {200.0, 100},
                {25355354.0, 12677677},
                {0, 0},
                {1, 0},
                {0.5, 0},
                {199.8, 99}
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "negativeKeepHydrated")
    public static Object[][] negativeKeepHydrated() {
        Object[][] testData = new Object[][]{
                {-50, -25},
                {-400000, -200000}
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "validDivisibleByDataProvider")
    public static Object[][] validDivisibleByDataProvider(){
        Object[][] testData = new Object[][]{
                {new int[]{1,2,3,4,5,6},2,new int[]{2,4,6}},
                {new int[]{1,2,3,4,5,6},3,new int[]{3,6}},
                {new int[]{0,1,2,3,4,5,6},4,new int[]{0,4}},
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "invalidDivisibleByDataProvider")
    public static Object[][] InvalidDivisibleByDataProvider(){
        Object[][] testData = new Object[][]{
                {new int[]{1,2,3,4,5,6},2,new int[]{1,3,2}},
                {new int[]{1,2,3,4,5,6},3,new int[]{1,6}},
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
    @DataProvider(name = "negativeDivisibleByDataProvider")
    public static Object[][] negativeDivisibleByDataProvider(){
        Object[][] testData = new Object[][]{
                {new int[]{-1,-2,-3,-4,5,6},2,new int[]{-2,-4,6}},
                {new int[]{1,-2,-3,4,5,6},-3,new int[]{-3,6}},
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "positiveTwoDecimalPlaces")
    public static Object[][] positiveTwoDecimalPlaces(){
        Object[][] testData = new Object[][]{
                {4.659725356, 4.66},
                {173735326.3783732637948948, 173735326.38},
                {0, 0.00},
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeTwoDecimalPlaces")
    public static Object[][] negativeTwoDecimalPlaces(){
        Object[][] testData = new Object[][]{
                {-4.659725356, -4.66},
                {-173735326.3783732637948948, -173735326.38},
                {-1124124.254623626, -1124124.25},
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
}
