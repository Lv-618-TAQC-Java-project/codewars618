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

    @DataProvider(name = "validOnlyForStockSummaryMethodConsoleScannerDataProvider")
    public static Object[][] validOnlyForStockSummaryMethodConsoleScannerDataProvider() {
        Object[][] param = {
                {new String("ABAR 200 CDXE 500 BKWR 250 BTSQ 890 DRTY 600"),new String[]{"ABAR", "200", "CDXE" ,"500", "BKWR", "250", "BTSQ", "890", "DRTY", "600"}},
                {new String("132 200 13 500 212 250 123 890 23 600"),new String[]{"132", "200", "13" ,"500", "212", "250", "123", "890", "23", "600"}},
                {new String("ABAR CDXE BKWR BTSQ DRTY"),new String[]{"ABAR", "CDXE", "BKWR" ,"BTSQ", "DRTY"}},
                {new String("ABAR"),new String[]{"ABAR"}},
        };
        return param;
    }

    @DataProvider(name = "invalidOnlyForStockSummaryMethodConsoleScannerDataProvider")
    public static Object[][] invalidOnlyForStockSummaryMethodConsoleScannerDataProvider() {
        Object[][] param = {
                {"","No line found"},
        };
        return param;
    }

}
