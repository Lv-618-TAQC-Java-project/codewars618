package com.ss.ita.kata.implementation.kubrub;

import com.ss.ita.kata.Seven;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double temp = 0.0;
        for(int i = 0; i < arr.length; i++){
            temp += arr[i];
        }
        int res = ((int) ((navg * (arr.length+1)) - temp));
        if (temp > navg){
            throw new IllegalArgumentException();
        }

        return res;
    }

    @Override
    public String seriesSum(int n) {
        if(n <= 0)
            return "0.00";
        double result = 0;
        int denominator = 1;
        while (n > 0){
            result += 1.0 / denominator;
            denominator += 3;
            n--;
        }
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).toString();
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int res = 0;
        int a = 0;
        int b = 0;
        for(int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if(a >= bef && b <= aft) {
                res++;
            }
        }
        return res;
    }
}