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
        long[] arrOfPrime = new long[2];
        for (long i = m; i <= n; i++) {
            if (numberIsPrime(i)) {
                if (arrOfPrime[0] != 0 && g == i - arrOfPrime[0]) {
                    arrOfPrime[1] = i;
                    return arrOfPrime;
                } else {
                    arrOfPrime[0] = i;
                }
            }
        }
        return null;
    }

    private static boolean numberIsPrime(long n) {
        for (long i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int countOfNumbers = 0;
        while (n > 0) {
            n = n / 5;
            countOfNumbers += n;
        }
        return countOfNumbers;
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
        if(n <= 0){
            return new long[]{};
        }
        String numberStr = Long.toString(n);
        long[] result = new long[3];
        result[0] = n;

        for (int i=0; i<numberStr.length();i++){
            for (int j=0; j<numberStr.length(); j++){
                String digitStr = numberStr.substring(i,i+1);
                String tempStr = numberStr.substring(0,i) + numberStr.substring(i+1);
                String tempStr2 = tempStr.substring(0,j) + digitStr + tempStr.substring(j);

                if (Long.parseLong(tempStr2)<result[0]){
                    result[0] = Long.parseLong(tempStr2);
                    result[1] =i;
                    result[2] = j;
                }
            }
        }
        return result;
    }
}
