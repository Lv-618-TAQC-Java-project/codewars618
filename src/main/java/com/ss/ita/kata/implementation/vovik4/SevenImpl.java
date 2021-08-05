package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        if(n<=0){
            return "0.00";
        }
        int denominator = 1;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) 1/denominator;
            denominator += 3;
        }
        return Double.toString((double) (Math.round(sum*100D)/100D));
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
