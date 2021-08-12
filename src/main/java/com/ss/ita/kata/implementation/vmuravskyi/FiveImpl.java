package com.ss.ita.kata.implementation.vmuravskyi;

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
        BigInteger sum = new BigInteger(String.valueOf(1));
        BigInteger multiply = new BigInteger(String.valueOf(1));
        BigInteger one = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(multiply);
            multiply = multiply.add(one);
        }

        String str = String.valueOf(sum);
        int length = str.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            String temp = String.valueOf(str.charAt(length - 1));
            if (temp.equals("0")) {
                result++;
                length--;
            }
        }
        return result;

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
