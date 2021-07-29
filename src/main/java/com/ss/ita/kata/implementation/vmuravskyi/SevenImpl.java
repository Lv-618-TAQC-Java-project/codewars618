package com.ss.ita.kata.implementation.vmuravskyi;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sumaVsixDonations = 0;
        for (int i = 0; i < arr.length; i++) {
            sumaVsixDonations += arr[i];
        }
        double result = Math.round((navg * (arr.length + 1)) - sumaVsixDonations);
        if (result <= 0) throw new IllegalArgumentException();
        return (long) result;
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
