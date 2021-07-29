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
        return null;
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
