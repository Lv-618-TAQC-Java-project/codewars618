package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

import java.util.LinkedList;
import java.util.List;

public class DataProviderClass {

    @DataProvider(name = "eightImplPackageProvider")
    public static Object[][] eightImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.ivannaveselovska.EightImpl()},
                {new com.ss.ita.kata.implementation.kubrub.EightImpl()},
                {new com.ss.ita.kata.implementation.maxde1.EightImpl()},
                {new com.ss.ita.kata.implementation.msemochko.EightImpl()},
                {new com.ss.ita.kata.implementation.shcherbakoveugene.EightImpl()},
                {new com.ss.ita.kata.implementation.vmuravskyi.EightImpl()},
                {new com.ss.ita.kata.implementation.vovik4.EightImpl()},
                {new com.ss.ita.kata.implementation.yranest.EightImpl()}
        };
    }

    @DataProvider(name = "sevenImplPackageProvider")
    public static Object[][] sevenImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.ivannaveselovska.SevenImpl()},
                {new com.ss.ita.kata.implementation.kubrub.SevenImpl()},
                {new com.ss.ita.kata.implementation.maxde1.SevenImpl()},
                {new com.ss.ita.kata.implementation.msemochko.SevenImpl()},
                {new com.ss.ita.kata.implementation.shcherbakoveugene.SevenImpl()},
                {new com.ss.ita.kata.implementation.vmuravskyi.SevenImpl()},
                {new com.ss.ita.kata.implementation.vovik4.SevenImpl()},
                {new com.ss.ita.kata.implementation.yranest.SevenImpl()}
        };
    }

    @DataProvider(name = "sixImplPackageProvider")
    public static Object[][] sixImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.ivannaveselovska.SixImpl()},
                {new com.ss.ita.kata.implementation.kubrub.SixImpl()},
                {new com.ss.ita.kata.implementation.maxde1.SixImpl()},
                {new com.ss.ita.kata.implementation.msemochko.SixImpl()},
                {new com.ss.ita.kata.implementation.shcherbakoveugene.SixImpl()},
                {new com.ss.ita.kata.implementation.vmuravskyi.SixImpl()},
                {new com.ss.ita.kata.implementation.vovik4.SixImpl()},
                {new com.ss.ita.kata.implementation.yranest.SixImpl()}
        };
    }

    @DataProvider(name = "fiveImplPackageProvider")
    public static Object[][] fiveImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.ivannaveselovska.FiveImpl()},
                {new com.ss.ita.kata.implementation.kubrub.FiveImpl()},
                {new com.ss.ita.kata.implementation.maxde1.FiveImpl()},
                {new com.ss.ita.kata.implementation.msemochko.FiveImpl()},
                {new com.ss.ita.kata.implementation.shcherbakoveugene.FiveImpl()},
                {new com.ss.ita.kata.implementation.vmuravskyi.FiveImpl()},
                {new com.ss.ita.kata.implementation.vovik4.FiveImpl()},
                {new com.ss.ita.kata.implementation.yranest.FiveImpl()}
        };
    }

    public static Object[][] combine(Object[][] impls, Object[][] data) {
        List<Object[]> matrix = new LinkedList<Object[]>();
        for (Object[] imp : impls) {
            for (Object[] inputParam : data) {
                int totalLength = imp.length + inputParam.length;
                Object[] temp = new Object[totalLength];
                temp[0] = imp[0];
                for (int i = 1; i < temp.length; i++) {
                    temp[i] = inputParam[i - 1];
                }
                matrix.add(temp);
            }
        }
        return matrix.toArray(new Object[0][0]);
    }
}
