package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long max = 0;
        long[] array = new long[2];
        for (long i = m; i < n; i++) {
            if (primeNumber(i)) {
                array[0] = i;
            }

            for (long j = array[0] + 1; j < n; j++) {
                if (primeNumber(j)) {
                    array[1] = j;
                }
                if (array[1] - array[0] == g && max == 0) {
                    max = array[0];
                }

            }
        }
        array[0] = max;
        array[1] = array[0] + g;
        if (max != 0)
            return array;
        else
            return null;
    }

    @Override
    public int zeros(int n) {
        int res=0;
        while(n>0){
            n/=5;
            res += n;
        }
        return res;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger sum = BigInteger.valueOf(0);
        int k = n.intValue()+1;
        BigInteger [] array = new BigInteger[k];
        array[0]= BigInteger.valueOf(1);
        array[1]= BigInteger.valueOf(1);
        for(int i = 2; i<k; i++){
            array[i]=array[i-1].add(array[i-2]);
        }
        for(int i=0;i<k;i++){
            sum = sum.add(array[i]);
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

    private  boolean primeNumber(long number) {
        for (int mod = 2; mod < Math.sqrt(number); ++mod) {
            if (number % mod == 0) {
                return false;
            }
        }

        return true;
    }
}