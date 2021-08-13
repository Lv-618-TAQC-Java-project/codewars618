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

    @Test(dataProvider = "validReadFloat")
    public void testReadFloat(String param, float expected) {
        InputStream input = new ByteArrayInputStream(param.getBytes());
        System.setIn(input);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readFloat(),expected);
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
}