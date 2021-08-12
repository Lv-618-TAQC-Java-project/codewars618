package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Five;

import java.math.BigInteger;


public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {

        if(v.length == 0){
            return 0;
        }
        if (v.length == 1){
            return 1;
        }
        int maxSteps1 = 0;
        int maxSteps2 = 1;
        int count = 0;
        boolean checkSegment = false;
        for (int j = 0; j < v.length-1; j++) {
            if (v[j]==v[j+1]) {
                maxSteps2++;
                if (checkSegment) {
                    count++;
                }
            } else if (v[j] < v[j+1]) {
                if (!checkSegment) {
                    maxSteps2++;
                } else {
                    if (maxSteps1 < maxSteps2) {
                        maxSteps1 = maxSteps2;
                    }
                    checkSegment = false;
                    maxSteps2 = 2 + count;
                    count = 0;
                }
            } else if (v[j] > v[j+1]) {
                count = 0;
                checkSegment = true;
                maxSteps2++;
            }
        }
        if (maxSteps1 < maxSteps2) {
            maxSteps1 = maxSteps2;
        }
        return maxSteps1;
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
