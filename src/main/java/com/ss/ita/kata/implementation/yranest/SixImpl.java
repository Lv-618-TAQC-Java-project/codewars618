package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long sum = 0;
        long n = 0;
        while(sum < m){
            n = n + 1;
            sum +=  n * n * n;
        }
        if(sum == m){
            return n;
        }
        else
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
        int sum = 0;
        boolean hasRunOnce = false;
        String stock = "";
        for(int i = 0; i < lstOf1stLetter.length; i++) {
            for(int j = 0; j < lstOfArt.length; j++) {
                if(lstOf1stLetter[i].charAt(0) == lstOfArt[j].charAt(0)) {
                    sum += Integer.parseInt(lstOfArt[j].substring(lstOfArt[j].indexOf(" ") + 1));
                }
                if(j == lstOfArt.length - 1) {
                    if(!hasRunOnce) {
                        stock += "(" + lstOf1stLetter[i] + " : " + sum + ")";
                        sum = 0;
                        hasRunOnce = true;
                    }
                    else {
                        stock += " - (" + lstOf1stLetter[i] + " : " + sum + ")";
                        sum = 0;
                    }
                }
            }
        }
        return stock;
    }
}
