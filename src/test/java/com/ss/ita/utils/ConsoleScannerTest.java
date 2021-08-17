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