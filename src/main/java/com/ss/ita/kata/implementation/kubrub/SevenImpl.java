package com.ss.ita.kata.implementation.kubrub;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double temp = 0.0;
        for(int i = 0; i < arr.length; i++){
            temp += arr[i];
        }
        double res = 0;

        res = (arr.length + 1) * navg;
        res -= temp;

        return (long)res;
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
