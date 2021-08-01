package com.ss.ita.kata.implementation.vmuravskyi;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long count = 0;
        long sumOfVolume = 0L;
        for (int i = 1; sumOfVolume < m; i++) {
            sumOfVolume += (long) i * i * i;
            count++;
        }
        if (sumOfVolume == m) {
            return count;
        } else return -1;
    }

    @Override
    public String balance(String book) {
        String[] bookArray = book.split("\n");

        StringBuffer sb = new StringBuffer(bookArray[0]);

        for (int i = 0; i < bookArray.length; i++) {
            bookArray[i] = bookArray[i].replaceAll("\"", "");
        }


        Double totalBalance = Double.valueOf(String.valueOf(bookArray[0]));
        bookArray[0] = "Original_Balance: ".concat(bookArray[0]);

        //GET SPENDING IN ARRAY
//        double[] spending = new double[bookArray.length];
//        for (int i = 0; i < bookArray.length; i++) {
//            spending[i] =
//        }
        double totalExpense = 0.00;
        double[] spending = new double[bookArray.length];
        for (int i = 1; i < bookArray.length; i++) {
            String[] temp = bookArray[i].split(" ");
            spending[i] = Double.valueOf(temp[2]);
            totalExpense += spending[i];
        }
        totalExpense = Math.round(totalExpense * 100);
        totalExpense = totalExpense / 100;
        double averageExpense = totalExpense / (bookArray.length - 1);
        averageExpense = Math.round(averageExpense*100);
        averageExpense = averageExpense/100;

        String result = "".concat(bookArray[0] + "\n");
        String add = "Balance ";
        double restBalance = 0.00;
        double spent = 0.00;
        double averageExpance = 0.00;
        for (int i = 1; i < bookArray.length; i++) {
//            restBalance = totalBalance-spending[i];
            restBalance = Math.round((totalBalance - spending[i]) * 100);
            restBalance /= 100;
            totalBalance = totalBalance - spending[i];
            result = result.concat(bookArray[i] + " " + add + restBalance + "\n");
        }
        String TotalExp = "Total expense: " + totalExpense;
        String AverExp = "\nAverage expence: " + averageExpense;
        return result.concat(TotalExp).concat(AverExp);
    }


    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
