package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String newBook;
        newBook = book.replaceAll("[^a-zA-Z0-9.\n ]","");
        String[] line = newBook.split("[\\n]");
        double balance = Double.parseDouble(line[0]);
        double totalExpense = 0;
        double spending = 0;
        int numberOfPurchase;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance is " + line[0]);
        for (int i = 1; i < line.length; i++) {
            spending++;
            String[] splitLine = line[i].split("[ ]+");
            balance -= Double.parseDouble(splitLine[2]);
            totalExpense += Double.parseDouble(splitLine[2]);
            String modLine = String.format("\n%s %s %s Balance %.2f", splitLine[0], splitLine[1], splitLine[2], balance);
            result.append(modLine);
        }
        result.append(String.format("\nTotal expense is %.2f\nAverage expense is %.2f", totalExpense, totalExpense/spending ));
        return result.toString();
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
