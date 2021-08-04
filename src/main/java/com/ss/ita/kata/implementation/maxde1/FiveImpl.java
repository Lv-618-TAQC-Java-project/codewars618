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
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }


    @Override
    public long[] smallest(long n) {

        assert n >= 0;
        String str = "" + n;
        final int numberDigits = str.length();

        String smallest = str;
        long smallestI = 0;
        long smallestJ = 0;

        for (int i = 0; i < numberDigits; i++) {
            for (int j = 0; j < numberDigits; j++) {
                if (i == j) continue;
                String str2 = str.substring(0,i) + str.substring(i+1);
                str2 = str2.substring(0,j) + str.charAt(i) + str2.substring(j);
                if (smallest.compareTo(str2) > 0) {
                    smallest = str2;
                    smallestI = i;
                    smallestJ = j;
                }
            }
        }
        return new long[]{Long.valueOf(smallest), smallestI, smallestJ};

    }
}
