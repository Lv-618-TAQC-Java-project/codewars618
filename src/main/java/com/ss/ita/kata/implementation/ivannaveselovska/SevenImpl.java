package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Seven;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (arr.length == 0 || navg <= 0)
            return -1L;
        double sum  = Arrays.stream(arr).sum();
        double expected  = navg * (arr.length + 1);
        return (long) (expected - sum);
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
        if (p <= 0 || bef < 0 || aft < 0)
            return 0;
        return p - bef;
    }
}
