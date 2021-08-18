package com.ss.ita.kata.implementation.vovik4;

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
        if(n.intValue() <= 0){
            return BigInteger.valueOf(0);
        }
        int iterator = n.intValue();
        BigInteger firstElement = new BigInteger("1");
        BigInteger secondElement = new BigInteger("1");
        BigInteger tempSumElement = new BigInteger("2");
        BigInteger tempVar = new BigInteger("1");
        BigInteger sum = new BigInteger("4");

        for (int i = 2; i < iterator; i++) {
            tempVar = firstElement;
            firstElement = tempSumElement;
            secondElement = tempVar;
            tempSumElement = firstElement.add(secondElement);
            sum = sum.add(tempSumElement);
        }
        BigInteger result = sum.multiply(BigInteger.valueOf(4));
        System.out.println(result);
        return result;
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
