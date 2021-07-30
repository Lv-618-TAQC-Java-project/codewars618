package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 1;
        long sum = 1;

        while (sum != m) {
            n++;
            sum += Math.pow(n, 3);
            if ((m - sum) < sum) {
                System.out.println("Maximum available Cubes: " + n);
                return -1;
            }
        }

        return n;
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
