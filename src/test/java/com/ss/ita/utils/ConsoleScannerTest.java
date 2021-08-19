package com.ss.ita.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;

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

    @Test(dataProvider = "validReadDouble")
    public void validReadDouble(String number, double expected) {
        InputStream input = new ByteArrayInputStream(number.getBytes());
        System.setIn(input);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readDouble(), expected);
    }

    @Test(dataProvider = "invalidReadDouble")
    public void invalidReadDouble(String number, String expected) {
        InputStream input = new ByteArrayInputStream(number.getBytes());
        System.setIn(input);
        ConsoleScanner sc = new ConsoleScanner();
        sc.readDouble();
    }

    @Test(dataProvider = "positiveReadIntArray")
    public void positiveTestReadIntArray(String input, int[] result) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(result, sc.readIntArray());
    }

    @Test(dataProvider = "negativeReadIntArray", expectedExceptions = Exception.class)
    public void negativeReadIntArray(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        sc.readIntArray();
    }

    @Test(dataProvider = "validInputIntConsoleScanner")
    public void validReadIntConsoleScanner(String input, int expected) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(expected, sc.readInt());
    }

    @Test(dataProvider = "invalidInputIntConsoleScanner")
    public void invalidInputIntConsoleScanner(String input, String expected) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        sc.readInt();
        String actual = String.valueOf(output).replaceAll("\r", "");
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "validOnlyForStockSummaryMethodConsoleScannerDataProvider")
    public void validOnlyForStockSummaryMethodConsoleScanner(String str, String[] expected) {
        InputStream in = new ByteArrayInputStream(str.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readStringArray(), expected);
    }

    @Test(dataProvider = "invalidOnlyForStockSummaryMethodConsoleScannerDataProvider", expectedExceptions = Exception.class)
    public void onlyForStockSummaryMethodConsoleScanner(String input, String expected) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.onlyForStockSummaryMethod(), expected);
    }

    @Test(dataProvider = "positiveReadBigInteger")
    public void positiveTestReadBigInteger(String actual, BigInteger expected) {
        InputStream input = new ByteArrayInputStream(actual.getBytes());
        System.setIn(input);
        ConsoleScanner scanner = new ConsoleScanner();
        Assert.assertEquals(scanner.readBigInteger(), expected);
    }

    @Test(dataProvider = "negativeReadBigInteger", expectedExceptions = Exception.class)
    public void negativeTestReadBigInteger(String actual, String expected) {
        InputStream input = new ByteArrayInputStream(actual.getBytes());
        System.setIn(input);
        ConsoleScanner scanner = new ConsoleScanner();
        scanner.readBigInteger();
    }

    @Test(dataProvider = "validReadFloat")
    public void testReadFloat(String param, float expected) {
        InputStream input = new ByteArrayInputStream(param.getBytes());
        System.setIn(input);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readFloat(), expected);
    }

    @Test(dataProvider = "invalidReadFloat")
    public void invalidTestReadFloat(String param, String expected) {
        InputStream input = new ByteArrayInputStream(param.getBytes());
        System.setIn(input);
        ConsoleScanner cs = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        cs.readFloat();
        String actual = String.valueOf(output).replaceAll("\r", "");
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "validReadStringArray")
    public void validReadStringArray( String str, String[] expected) {
        InputStream in = new ByteArrayInputStream(str.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readStringArray(),expected);
    }
}