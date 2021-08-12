package com.ss.ita.utils;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ConsoleScannerTest extends ConsoleScannerDataProvider{



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