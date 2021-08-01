package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if (v == null) {
            return 0;
        } else if (v.length == 1) {
            return 1;
        }
        int maxNumber = 0;
        int biggerThan;

        for (int i = 0; i < v.length; i++) {
            biggerThan = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (v[j]>=v[j+1]){
                    biggerThan++;
                }
            }
            for (int j = i; j < v.length-1;j++){
                if (v[j+1]>=v[j]){
                    biggerThan++;
                }
            }
            if (maxNumber < biggerThan) {
                maxNumber = biggerThan;
            }
        }
        return maxNumber;
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
