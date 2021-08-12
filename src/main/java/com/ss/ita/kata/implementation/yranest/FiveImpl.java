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
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
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
}
