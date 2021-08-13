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

    @Test(dataProvider = "validInputIntConsoleScanner")
    public void validReadIntConsoleScanner(String input,int expected) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(expected,sc.readInt());
    }

    @Test(dataProvider = "invalidInputIntConsoleScanner",expectedExceptions = Exception.class)
    public void invalidInputIntConsoleScanner(String input,String expected) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        //Assert.assertEquals(expected,sc.readInt());
        sc.readInt();
    }

}