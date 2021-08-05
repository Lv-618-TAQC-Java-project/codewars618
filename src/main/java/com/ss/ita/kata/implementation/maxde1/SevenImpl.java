package com.ss.ita.kata.implementation.maxde1;

import com.ss.ita.kata.Seven;

import java.text.DecimalFormat;

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
        int divider = 1;
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum +=(double) 1/divider;
            divider +=3;
        }
        String result = String.format("%.2f",sum);
        return result;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if((p-bef)<= aft){
            return p-bef;
        }
        else {
            return aft+1;
        }
    }
}
