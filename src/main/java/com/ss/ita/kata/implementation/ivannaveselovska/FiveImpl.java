package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        int maxNumber = 0;
        for (int i = 0; i < v.length; i++) {
            int iMax = 1;
            for (int j = i - 1; j >= 0 ; j--) {
                if (v[j] <= v[j + 1]) {
                    iMax++;
                    continue;
                }
                break;
            }
            for (int j = i + 1; j < v.length; j++) {
                if (v[j - 1] >= v[j]) {
                    iMax++;
                    continue;
                }
                break;
            }
            if (iMax > maxNumber)
                maxNumber = iMax;
        }
        return maxNumber;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
