package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderClass{
    @DataProvider(name = "positiveArtificialRain")
    public static Object[][] positiveArtificialRain(){
        Object[][] testData = new Object[][]{
                {new int[]{1,2,1,2,1}, 3},
                {new int[]{0}, 1},
                {new int[]{9,5,4,3,8}, 4},
                {new int[]{1,1,1,1}, 4},
                {new int[]{0,0,0,0},4},
                {new int[]{12,13,11,10},4},
                {new int[]{},0}
        };
        return combine(fiveImplPackageProvider(), testData);
    }

}
