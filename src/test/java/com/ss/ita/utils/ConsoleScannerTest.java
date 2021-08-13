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
    @Test(dataProvider = "validReadLong")
    public void validReadLong( String number, long expected) {
        InputStream in = new ByteArrayInputStream(number.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readLong(), expected);
    }
    @Test(dataProvider = "invalidReadLong", expectedExceptions = Exception.class)
    public void invalidReadLong( String number, String expected) {
        InputStream in = new ByteArrayInputStream(number.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        sc.readLong();
    }
}