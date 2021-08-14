package com.ss.ita.kata.implementation.vmuravskyi;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if (v.length == 0) {
            return 0;
        } else if (v.length == 1) {
            return 1;
        }

        int result = 0;
        int[] left = new int[v.length];
        int[] right = new int[v.length];

        for (int i = 1; i < v.length; i++)
            if (v[i - 1] <= v[i]) {
                left[i] = left[i - 1] + 1;
            }

        for (int i = v.length - 2; i >= 0; i--)
            if (v[i + 1] <= v[i]) {
                right[i] = right[i + 1] + 1;
            }

        for (int i = 0; i < v.length; i++) {
            int currentSize = left[i] + right[i] + 1;
            if (currentSize > result)
                result = currentSize;
        }
        return result;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] primes = new long[2];
        while (m <= n) {
            if (prime(m)) {
                primes[0] = primes[1];
                primes[1] = m;
                if (primes[1] - primes[0] == g) {
                    return new long[]{primes[0], primes[1]};
                }
            }
            m++;
        }
        return null;
    }

    public boolean prime(long number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int nNotInvalid = n.intValue();
        if (nNotInvalid <= 0) {
            return BigInteger.valueOf(0);
        }
        BigInteger before = BigInteger.valueOf(1);
        BigInteger now = before;
        BigInteger sum = now;
        int o = n.intValue();
        for (int x = 0; x < o; x++) {
            BigInteger temp = now;
            sum = sum.add(now);
            now = now.add(before);
            before = temp;
        }
        sum = sum.multiply(BigInteger.valueOf(4));
        return sum;
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
