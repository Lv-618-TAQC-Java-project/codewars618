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
        if (m <= 0) {
            return -1;
        }
        return (2 * m + 1 - Math.sqrt(Math.pow(2 * m + 1, 2) - 4 * m * m)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        if (n <= 0) {
            return new long[0];
        }
        String s = Long.toString(n), tmp = s;
        long[] mem = new long[]{-1, -1, -1};
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            String str1 = s.substring(0, i) + s.substring(i + 1, l);
            for (int j = 0; j < l; j++) {
                String str2 = str1.substring(0, j) + c + str1.substring(j, str1.length());
                int cmp = str2.compareTo(tmp);
                if (cmp < 0) {
                    tmp = str2;
                    mem[0] = Long.parseLong(tmp);
                    mem[1] = i;
                    mem[2] = j;
                }
            }
        }
        if (mem[0] == -1) {
            mem[0] = n;
            mem[1] = 0;
            mem[2] = 0;
        }
        return mem;
    }
}
