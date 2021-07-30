package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Six;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] arrayOfLines = book.split("\n");
        String[] properArrayOfLines = new String[arrayOfLines.length];
        StringBuilder result = new StringBuilder("");
        double balance;
        double totalExpense = 0;
        double avgExpense;

        properArrayOfLines[0] = arrayOfLines[0].replaceAll("[^\\d.]", "");
        for (int i = 1; i < properArrayOfLines.length; i++) {
            properArrayOfLines[i] = arrayOfLines[i].replaceAll("[^\\da-zA-Z .]", "")
                    .trim().replaceAll(" +", " ");
        }

        balance = Double.parseDouble(properArrayOfLines[0]);
        result.insert(0, "Original Balance: " + properArrayOfLines[0]);
        for (int i = 1; i < properArrayOfLines.length; i++) {
            balance -= Double.parseDouble(properArrayOfLines[i].split(" ")[2]);
            totalExpense += Double.parseDouble(properArrayOfLines[i].split(" ")[2]);
            result
                    .append("\n")
                    .append(properArrayOfLines[i])
                    .append(" Balance ")
                    .append(new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP));
        }

        avgExpense = totalExpense/(properArrayOfLines.length - 1);

        return result
                .append("\n")
                .append("Total expense  ")
                .append(new BigDecimal(totalExpense).setScale(2, RoundingMode.HALF_UP))
                .append("\n")
                .append("Average expense  ")
                .append(new BigDecimal(avgExpense).setScale(2, RoundingMode.HALF_UP))
                .toString();
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
