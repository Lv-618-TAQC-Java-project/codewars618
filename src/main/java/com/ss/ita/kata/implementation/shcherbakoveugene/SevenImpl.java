package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        int sum = 0;

        for (double el: arr) {
            sum += el;
        }

        long result = ((arr.length + 1) * (long)navg) - sum;

        return result < 0 ? -1 : result;
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
