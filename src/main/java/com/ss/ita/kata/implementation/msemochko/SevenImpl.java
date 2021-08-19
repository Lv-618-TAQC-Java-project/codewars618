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
        double expected  = navg * (arr.length + 1);
        long nextBenefactor = (long) (expected - sumOfNumbers);
        if (nextBenefactor <= 0)
            throw new IllegalArgumentException();
        return unknown;
    }

    @Override
    public String seriesSum(int n) {
        if (n <= 0) {
            return "0.00";
        } else {
            double seriesSum = 0.0;
            for (int i = 0; i < n; i++) {
                seriesSum += 1.0 / (1 + 3 * i);
            }
            return Double.toString((double) (Math.round(seriesSum*100D)/100D));
        }
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if (p<=2 || bef < 0 || aft < 0){
            return 0;
        }
        return Math.min(p-bef, ++aft);
    }
}
