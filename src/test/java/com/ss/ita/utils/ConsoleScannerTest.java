package com.ss.ita.utils;

import com.ss.ita.kata.ConsoleScannerDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleScannerTest extends ConsoleScannerDataProvider {

    @Test(dataProvider = "validConsoleScanner")
    public void validTestReadDoubleArray(ConsoleScanner scanner, String[] arr, String expected) {
//        Assert.assertEquals(scanner.readDoubleArray(arr), expected);
    }

    @Test
    public void testReadFloat() {
        String floatValue = "34.67";
        InputStream in = new ByteArrayInputStream(floatValue.getBytes());
        System.setIn(in);
        ConsoleScanner sc = new ConsoleScanner();
        Assert.assertEquals(sc.readFloat(),34.67f);
    }
}