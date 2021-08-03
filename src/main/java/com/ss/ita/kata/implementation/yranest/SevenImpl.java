package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        long ans = (long) Math.ceil((arr.length + 1) * navg - sum);
        if (ans < 0) throw new IllegalArgumentException();
        return ans;
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
