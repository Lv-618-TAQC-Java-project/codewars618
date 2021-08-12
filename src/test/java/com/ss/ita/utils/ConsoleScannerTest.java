package com.ss.ita.utils;

import org.testng.Assert;
import org.testng.annotations.*;

public class ConsoleScannerTest {



    @BeforeClass
    public void beforeClass() {
        System.out.println("Start of the class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("The end of class");
    }

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testReadDoubleArray() {
//        ConsoleScanner sc = new ConsoleScanner();
//        double[] expected = new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
//        sc.readDoubleArray();

    }

    @Test
    public void testReadFloat() {

    }
}