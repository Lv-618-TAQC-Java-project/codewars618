package com.ss.ita.kata.implementation.maxde1;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        long n=0;
        long sum = 0;
        while(sum < m){
            n+=1;
            sum += (n*n*n);
        }

        if (sum == m){
            return n;
        }
        return -1;
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
