package com.ss.ita.utils;

import com.ss.ita.kata.DataProviderClass;
import org.testng.annotations.DataProvider;

public class ConsoleScannerDataProvider extends DataProviderClass {

    @DataProvider(name = "validConsoleScanner")
    public static Object[][] validConsoleScanner() {
        Object[][] param = {
                {new String("1 2 3 4 5"), new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}},
                {new String("123 234 345 456 567"), new Double[]{123.0, 234.0, 345.0, 456.0, 567.0}}
        };
        return param;
    }

    @DataProvider(name = "invalidConsoleScanner")
    public static Object[][] invalidConsoleScanner() {
        Object[][] param = {
                {new String("1 2 qwe 4 5"), new String("Value qwe is not Double, please try again.")},
                {new String("123 234 a 567"), new String("Value a is not Double, please try again.")}
        };
        return param;
    }
}
