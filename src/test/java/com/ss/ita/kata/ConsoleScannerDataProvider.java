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

    @DataProvider(name = "validInputIntConsoleScanner")
    public static Object[][] validInputIntConsoleScanner() {
        Object[][] param = new Object[][]{
                {"3", 3},
                {"0", 0},
                {"-6",-6},
                {"100",100},
        };
        return param;
    }

    @DataProvider(name = "invalidInputIntConsoleScanner")
    public static Object[][] invalidInputIntConsoleScanner() {
        Object[][] param = new Object[][]{
                {"feef", new String("Value is not 'Integer', please try again.")},
                {"2.42", new String("Value is not 'Integer', please try again.")},
        };
        return param;
    }
}
