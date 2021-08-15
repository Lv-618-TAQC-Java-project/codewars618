package com.ss.ita.utils;

import com.ss.ita.kata.ConsoleScannerDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

public class ConsoleScannerTest extends ConsoleScannerDataProvider {

    @Test(dataProvider = "validConsoleScanner")
    public void validTestReadDoubleArray(ConsoleScanner scanner, String[] arr, String expected) {
//        Assert.assertEquals(scanner.readDoubleArray(arr), expected);
    }

    @Test(dataProvider = "validOnlyForStockSummaryMethodConsoleScannerDataProvider")
    public void validOnlyForStockSummaryMethodConsoleScanner( String str, String[] expected) {
        InputStream in = new ByteArrayInputStream(str.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readStringArray(),expected);
    }

    @Test(dataProvider = "invalidOnlyForStockSummaryMethodConsoleScannerDataProvider",expectedExceptions = Exception.class)
    public void onlyForStockSummaryMethodConsoleScanner(String input,String  expected) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.onlyForStockSummaryMethod(),expected);
    }
}