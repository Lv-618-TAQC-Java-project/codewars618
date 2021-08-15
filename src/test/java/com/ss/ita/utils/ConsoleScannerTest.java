package com.ss.ita.utils;

import com.ss.ita.kata.ConsoleScannerDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleScannerTest extends ConsoleScannerDataProvider {

    @Test(dataProvider = "validReadDouble")
    public void validReadDouble( String number, double expected) {
        InputStream input = new ByteArrayInputStream(number.getBytes());
        System.setIn(input);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readDouble(), expected);
    }
    @Test(dataProvider = "invalidReadDouble")
    public void invalidReadDouble( String number, String expected) {
        InputStream input = new ByteArrayInputStream(number.getBytes());
        System.setIn(input);
        ConsoleScanner sc = new ConsoleScanner();
        sc.readDouble();
    }
}