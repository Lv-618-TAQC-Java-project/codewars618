package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = Arrays.stream(arr).sum();
        double result = navg * (arr.length + 1) - sum;
        if(result > 0){
            return Math.round(Math.ceil(result));
        }else {
            throw new IllegalArgumentException();
        }
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
        if(p<=0 || bef == 0 || aft ==0){
            return 0;
        }
        return Math.min(p - bef, aft + 1);
    }
}
