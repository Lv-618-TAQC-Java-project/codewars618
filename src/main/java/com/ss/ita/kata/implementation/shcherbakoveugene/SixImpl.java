package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        String[] values = getArrayOfValues(town, strng);
        if (values.length == 0) {
            return -1;
        }
        double sum = 0;

        for (String el: values) {
            sum += Double.parseDouble(el);
        }

        return sum/12;
    }

    @Override
    public double variance(String town, String strng) {
        String[] values = getArrayOfValues(town, strng);
        double mean = mean(town, strng);
        if (values.length == 0) {
            return -1;
        }
        double squareSum = 0;

        for (String el: values) {
            squareSum += Math.pow((Double.parseDouble(el) - mean), 2);
        }

        return squareSum/12;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }

    private String[] getArrayOfValues(String town, String strng) {
        String[] arrayOfValues = new String[12];
        String[] arrayOfTowns = strng.split("\n");

        for (int i = 0; i < arrayOfTowns.length; i++) {
            if (arrayOfTowns[i].substring(0, arrayOfTowns[i].indexOf(":")).equals(town)) {
                arrayOfValues = arrayOfTowns[i]
                        .replaceAll("[^\\d.]", " ")
                        .trim()
                        .replaceAll(" +", " ")
                        .split(" ");
                break;
            } else if (i == arrayOfTowns.length - 1) {
                return new String[0];
            }
        }
        return arrayOfValues;
    }
}
