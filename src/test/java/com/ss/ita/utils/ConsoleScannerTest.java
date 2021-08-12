package com.ss.ita.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleScannerTest extends ConsoleScannerDataProvider {

    @Test(dataProvider = "validConsoleScanner")
    public void validTestReadDoubleArray(String param, Double[] expected) {
        InputStream input = new ByteArrayInputStream(param.getBytes());
        System.setIn(input);
        ConsoleScanner scanner = new ConsoleScanner();
        Assert.assertEquals(scanner.readDoubleArray(), expected);
    }
    @Test(dataProvider = "invalidConsoleScanner")
    public void invalidTestReadDoubleArray(String param, String expected) {
        InputStream input = new ByteArrayInputStream(param.getBytes());
        System.setIn(input);
        ConsoleScanner scanner = new ConsoleScanner();
        Assert.assertEquals(scanner.readDoubleArray(), expected);
    }
}