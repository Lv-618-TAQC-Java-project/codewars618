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

    @DataProvider(name = "validReadFloat")
    public static Object[][] validReadFloat() {
        Object[][] param = {
                {"34.56", 34.56f},
                {"0.6758", 0.6758f}
        };
        return param;
    }

    @DataProvider(name = "invalidReadFloat")
    public static Object[][] invalidReadFloat() {
        Object[][] param = {
                {"23.g\n23.78", "Value is not 'float', please try again.\n"},
                {"www\n3.567", "Value is not 'float', please try again.\n"}
        };
        return param;
    }
}
