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

        return new long[0];
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
