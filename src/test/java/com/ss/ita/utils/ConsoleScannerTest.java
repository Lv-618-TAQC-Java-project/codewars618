package com.ss.ita.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import java.io.*;

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
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        scanner.readDoubleArray();
        String actual = String.valueOf(output).replaceAll("\r", "");
        Assert.assertEquals(actual, expected);
    }
    @Test(dataProvider = "positiveReadIntArray")
    public void positiveTestReadIntArray(String input, int[] result){
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(result,sc.readIntArray());
    }
    @Test(dataProvider = "negativeReadIntArray", expectedExceptions = Exception.class)
    public void negativeReadIntArray(String input){
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        sc.readIntArray();
    }


}