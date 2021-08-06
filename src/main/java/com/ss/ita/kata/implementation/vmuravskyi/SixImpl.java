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

        for (int i = 0; i < bookArray.length; i++) {
            bookArray[i] = bookArray[i].replace("\"", "");
        }

        double totalBalance = Double.parseDouble(bookArray[0]);
        bookArray[0] = "Original Balance: ".concat(bookArray[0]);

        double totalExpense = 0.00;
        double[] spending = new double[bookArray.length];
        for (int i = 1; i < bookArray.length; i++) {
            String[] temp = bookArray[i].split(" ");
            spending[i] = Double.parseDouble(temp[temp.length - 1]);
            totalExpense += spending[i];
        }

        totalExpense = Double.parseDouble(String.format("%3.2f", totalExpense));
        double averageExpense = Double.parseDouble(String.format("%3.2f", totalExpense / (bookArray.length - 1)));

        String result = "".concat(bookArray[0] + "\n");
        String add = "Balance ";
        double restBalance;

        for (int i = 1; i < bookArray.length; i++) {
            restBalance = Math.round((totalBalance - spending[i]) * 100);
            restBalance /= 100;
            totalBalance = totalBalance - spending[i];
            result = result.concat(bookArray[i] + " " + add + restBalance + "\n");
        }

        String totalExp = "Total expense: " + totalExpense;
        String averExp = "\nAverage expense: " + averageExpense;
        return result.concat(totalExp).concat(averExp);
    }


    @Override
    public double f(double x) {
        return x / (1.0 + Math.sqrt(1.0 + x));
    }

    @Override
    public double mean(String town, String strng) {

        String[] split = strng.split("\n");

        String[] cities = new String[split.length];
        String[] temp;
        int cityIndex = 0;
        for (int i = 0; i < split.length; i++) {
            temp = split[i].split(":");
            cities[i] = temp[0];
            if (town.equals(cities[i])) {
                cityIndex = i;
            }
        }

        String[] rainfall = split[cityIndex].split("[^\\d{1,3}.\\d{1}]");
        double suma = 0;
        String ammount = "";
        int count = 0;
        for (String s : rainfall) {
            ammount = s.replace(",", "");
            if (ammount.isEmpty()) {
                continue;
            } else suma += Double.parseDouble(ammount);
            count++;
        }
        if (suma == 0) {
            return -1;
        }

        return suma / count;
    }

    @Override
    public double variance(String town, String strng) {
        String[] split = strng.split("\n");
        String[] cities = new String[split.length];
        String[] temp;
        int cityIndex = 0;
        for (int i = 0; i < split.length; i++) {
            temp = split[i].split(":");
            cities[i] = temp[0];
            if (town.equals(cities[i])) {
                cityIndex = i;
            }
        }

        String[] rainfall = split[cityIndex].split("[^\\d{1,3}.\\d{1}]");
        double suma = 0;
        String ammount = "";
        int count = 0;
        for (String s : rainfall) {
            ammount = s.replace(",", "");
            if (ammount.isEmpty()) {
                continue;
            } else suma += Double.parseDouble(ammount);
            count++;
        }

        double avarage = suma / count;
        double[] difference = new double[count];
        double variance = 0;
        int j = 0;
        for (String s : rainfall) {
            ammount = s.replace(",", "");
            if (ammount.isEmpty()) {
                continue;
            } else difference[j++] = (Double.parseDouble(ammount) - avarage) * (Double.parseDouble(ammount) - avarage);
        }
        for (double v : difference) {
            variance += v;
        }
        return variance / count;
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
