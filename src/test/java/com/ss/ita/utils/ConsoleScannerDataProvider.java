package com.ss.ita.utils;

import com.ss.ita.kata.DataProviderClass;
import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class ConsoleScannerDataProvider extends DataProviderClass {
    @DataProvider(name = "validReadDouble")
    public static Object[][] validReadDouble() {
        Object[][] testData = new Object[][]{
                {"431.24", 431.24},
                {"151.21", 151.21},
                {"0.0", 0.0},
                {"-152.14", -152.14},
        };
        return testData;
    }

    @DataProvider(name = "invalidReadDouble")
    public static Object[][] invalidReadDouble() {
        Object[][] testData = new Object[][]{
                {"12525",new String("Value is not 'double', please try again")},
                {"-125125124",new String("Value is not 'double', please try again")},
        };
        return testData;
    }
    @DataProvider(name = "validConsoleScanner")
    public static Object[][] validConsoleScanner() {
        Object[][] param = {
                {new String("1 2 3 4 5"), new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}},
                {new String("123 234 345 456 567"), new Double[]{123.0, 234.0, 345.0, 456.0, 567.0}}
        };
        return param;
    }

    @DataProvider(name = "invalidConsoleScanner")
    public static Object[][] invalidConsoleScanner() {
        Object[][] param = {
                {new String("1 2 qwe 4 5\n3"), new String("Value qwe is not Double, please try again.\n")},
                {new String("123 234 a 567 c\n3\n4"), new String("Value a is not Double, please try again.\n" +
                        "Value c is not Double, please try again.\n")}
        };
        return param;
    }
    @DataProvider(name = "positiveReadIntArray")
    public static Object[][] positiveReadIntArray(){
        Object[][] testData = new Object[][]{
                {"1 3 5 6 6", new int[]{1, 3, 5, 6, 6}},
                {"1 4343 2534 0000", new int[]{1, 4343, 2534, 0}},
                {"0", new int[]{0}},
                {" ", new int[]{}},
                {"0001 000002 000023", new int[]{1, 2, 23}}
        };
        return testData;
    }
    @DataProvider(name = "negativeReadIntArray")
    public static Object[][] negativeReadIntArray(){
        Object[][] testData = new Object[][]{
                {"1  1  2  4  5"},
                {"re1 433 t4353"},
                {"# 12% 0"},
                {"343_242_42_943"},
                {"1, 3, 5, 6"},
                {"1111111111111111111111111111111111222222222222"},
                {"\"1 2 4 5 6\""},
                {"\"1\", \"2\""}
        };
        return testData;
    }

    @DataProvider(name = "validInputIntConsoleScanner")
    public static Object[][] validInputIntConsoleScanner() {
        Object[][] param = new Object[][]{
                {"3", 3},
                {"0", 0},
                {"-6",-6},
                {"100",100},
        };
        return param;
    }

    @DataProvider(name = "invalidInputIntConsoleScanner")
    public static Object[][] invalidInputIntConsoleScanner() {
        Object[][] param = new Object[][]{
                {"ffw\n23", new String("Value is not 'Integer', please try again.\n")},
                {"2.42\n1", new String("Value is not 'Integer', please try again.\n")},
                {"*-=+\n1", new String("Value is not 'Integer', please try again.\n")},
        };
        return param;
    }

    @DataProvider(name = "validOnlyForStockSummaryMethodConsoleScannerDataProvider")
    public static Object[][] validOnlyForStockSummaryMethodConsoleScannerDataProvider() {
        Object[][] param = {
                {new String("ABAR 200 CDXE 500 BKWR 250 BTSQ 890 DRTY 600"),new String[]{"ABAR", "200", "CDXE" ,"500", "BKWR", "250", "BTSQ", "890", "DRTY", "600"}},
                {new String("132 200 13 500 212 250 123 890 23 600"),new String[]{"132", "200", "13" ,"500", "212", "250", "123", "890", "23", "600"}},
                {new String("ABAR CDXE BKWR BTSQ DRTY"),new String[]{"ABAR", "CDXE", "BKWR" ,"BTSQ", "DRTY"}},
                {new String("ABAR"),new String[]{"ABAR"}},
        };
        return param;
    }

    @DataProvider(name = "invalidOnlyForStockSummaryMethodConsoleScannerDataProvider")
    public static Object[][] invalidOnlyForStockSummaryMethodConsoleScannerDataProvider() {
        Object[][] param = {
                {"","No line found"},
        };
        return param;
    }

    @DataProvider
    public static Object[][] positiveReadBigInteger(){
        Object[][] testData = new Object[][]{
                {"1", BigInteger.valueOf(1)},
                {"9223372036854775807", BigInteger.valueOf(9223372036854775807L)},
                {"-9223372036854775808", BigInteger.valueOf(-9223372036854775808L)},
                {"000000000", BigInteger.valueOf(0)}
        };
        return testData;
    }

    @DataProvider
    public static Object[][] negativeReadBigInteger(){
        Object[][] testData = new Object[][]{
                {"adm", "Value is not 'BigInteger', please try again."},
                {"922337203685.078", "Value is not 'BigInteger', please try again."},
                {"-9,223,372,036,854,775,808", "Value is not 'BigInteger', please try again."},
                {"1_$%+", "Value is not 'BigInteger', please try again."}
        };
        return testData;
    }
}
