package com.ss.ita.kata.implementation.maxde1;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double arrSum = 0;
        for (double i: arr){
            arrSum += i;
        }
        long nextBenefactor = (long) Math.ceil(navg*(arr.length+1)-arrSum);

        if (nextBenefactor <= 0){
            throw new IllegalArgumentException();
        }
        else{
            return nextBenefactor;
        }

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
