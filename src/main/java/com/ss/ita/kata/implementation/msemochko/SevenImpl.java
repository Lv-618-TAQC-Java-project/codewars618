package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Seven;

import java.math.BigInteger;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sumOfNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfNumbers += arr[i];
        }
        int unknown = BigInteger.valueOf((long) ((navg * (arr.length+1)) - sumOfNumbers)).intValue();
        return unknown;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
