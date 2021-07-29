package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Seven;


public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sumOfNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfNumbers += arr[i];
        }
        int unknown = ((int) ((navg * (arr.length+1)) - sumOfNumbers));
        return unknown;
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        } else {
            double seriesSum = 0.0;
            for (int i = 0; i < n; i++) {
                seriesSum += 1.0 / (1 + 3 * i);
            }
            return String.format("%.2f", seriesSum);
        }
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
