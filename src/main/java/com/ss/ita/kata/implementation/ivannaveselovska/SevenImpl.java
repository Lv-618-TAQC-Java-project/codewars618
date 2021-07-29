package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Seven;

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
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
