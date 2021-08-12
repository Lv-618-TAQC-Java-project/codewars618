package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Seven;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        if (n <= 0) {
            return "0.00";
        }
        int divider = 1;
        double dResult = 1;

        for (int i = 0; i < n-1; i++) {
            divider += 3;
            dResult += (1d/divider);
        }

        BigDecimal result = new BigDecimal(dResult);
        result = result.setScale(2, RoundingMode.HALF_UP);

        return result.toString();
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - bef;
    }
}
