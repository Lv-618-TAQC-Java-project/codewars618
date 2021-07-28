package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long cubeNumber = 0;
        for ( long i = 1; m > 0 ; i++){
            m -= i * i * i;
            cubeNumber++;
        }
        return m == 0 ? cubeNumber : -1L;
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
