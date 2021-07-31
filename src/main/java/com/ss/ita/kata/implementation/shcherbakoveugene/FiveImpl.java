package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        long f = factorial(n);
        String[] str = String.valueOf(f).split("");
        int count = 0;

        for (int i = str.length - 1; i >= 0; i --) {
            if (str[i].equals("0")) {
                count ++;
            } else {
                break;
            }
        }

        return count;
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

    private long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
}
