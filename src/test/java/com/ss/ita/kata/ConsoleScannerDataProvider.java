package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class ConsoleScannerDataProvider extends DataProviderClass {

    @DataProvider(name = "validConsoleScanner")
    public static Object[][] validConsoleScanner() {
        Object[][] param = {
                {1, 2, 3, 4, 5},
                {123, 234, 345, 456, 567}
        };
        return combine(ConsoleScannerProvider(), param);
    }

    @DataProvider(name = "invalidConsoleScanner")
    public static Object[][] invalidConsoleScanner() {
        Object[][] param = {
                {1, 2, 3, "qwe", 5, new String("Value qwe is not Double, please try again.")},
                {123, "a", 345, 456, new String("Value a is not Double, please try again.")}
        };
        return combine(ConsoleScannerProvider(), param);
    }
    @DataProvider(name = "validReadLong")
    public static Object[][] validReadLong(){
        Object[][] testData = new Object[][]{
                {"43124",43124},
                {"151215215",151215215},
                {"0",0},
                {"-15214",-15214},
        };
        return testData;
    }
    @DataProvider(name = "invalidReadLong")
    public static Object[][] invalidReadLong(){
        Object[][] testData = new Object[][]{
                {"something",new String("Value is not 'long', please try again")},
                {"1.2525",new String("Value is not 'long', please try again")},
                {"-125.125124",new String("Value is not 'long', please try again")},
        };
        return testData;
    }
}
