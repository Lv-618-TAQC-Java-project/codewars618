package com.ss.ita.utils;

import com.ss.ita.kata.ConsoleScannerDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleScannerTest extends ConsoleScannerDataProvider {

    @Test(dataProvider = "validConsoleScanner")
    public void validTestReadDoubleArray(ConsoleScanner scanner, String[] arr, String expected) {
//        Assert.assertEquals(scanner.readDoubleArray(arr), expected);
    }

    @Test(dataProvider = "validReadStringArray")
    public void validReadStringArray( String str, String[] expected) {
        InputStream in = new ByteArrayInputStream(str.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readStringArray(),expected);
    }
}