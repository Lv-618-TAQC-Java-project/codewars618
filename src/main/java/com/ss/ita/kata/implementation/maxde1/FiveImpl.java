package com.ss.ita.kata.implementation.maxde1;

import com.ss.ita.kata.Five;

import java.math.BigInteger;


public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
      return 0;
    }


    @Override
    public long[] gap(int g, long m, long n) {
        long previousPrimeNumber = -1;
        for(long i = m; i <= n; i++) {
            if(primeNumber(i)) {
                if((i - previousPrimeNumber) == g) {
                    System.out.println(i - previousPrimeNumber);
                    long[] pairOfPrime = {previousPrimeNumber, i};
                    return pairOfPrime;
                }
                previousPrimeNumber = i;
            }
        }
        return null;
    }

    public static boolean primeNumber(long num) {
        for(int i = 2; i < num; i++) {
            if((double)num / i == Math.floor((double)num / i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        double findKmax= Math.floor(Math.log10(n)/Math.log10(5));
        System.out.println(findKmax);
        int sum =0;
        for (int k =1; k <= findKmax; k++){
            sum+=n/Math.pow(5, k);
        }

        return sum;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger last = BigInteger.valueOf(0);
        BigInteger curr = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(1);
        for (long i = 0; i < n.longValue(); i++) {
            BigInteger next = curr.add(last);
            sum = sum.add(next);
            last = curr;
            curr = next;
        }
        return sum.multiply(BigInteger.valueOf(4));
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
