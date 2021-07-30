package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Seven;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
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
        return 0;
    }
}
