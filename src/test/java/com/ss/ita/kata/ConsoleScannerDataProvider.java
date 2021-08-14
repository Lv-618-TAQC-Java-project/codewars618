package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

import java.math.BigDecimal;

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

    @DataProvider(name = "validInputBigDecimalConsoleScanner")
    public static Object[][] validInputBigDecimalConsoleScanner() {
        Object[][] testData = {
                {"32", new BigDecimal ("32")},
                {"13.333333333333333333333", new BigDecimal("13.333333333333333333333")}
        };
        return testData;
    }
}
