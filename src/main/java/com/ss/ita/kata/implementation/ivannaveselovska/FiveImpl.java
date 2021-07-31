package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        int maxNumber = 0;
        for (int i = 0; i < v.length; i++) {
            int iMax = 1;
            for (int j = i - 1; j >= 0 ; j--) {
                if (v[j] <= v[j + 1]) {
                    iMax++;
                    continue;
                }
                break;
            }
            for (int j = i + 1; j < v.length; j++) {
                if (v[j - 1] >= v[j]) {
                    iMax++;
                    continue;
                }
                break;
            }
            if (iMax > maxNumber)
                maxNumber = iMax;
        }
        return maxNumber;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] primePair = new long[2];
        for (long i = m; i <= n; i++) {
            if(isPrime(i)) {
                primePair[0] = i;
                break;
            }
        }
        for (long i = primePair[0] + 1; i <= n ; i++) {
            if(isPrime(i))
                primePair[1] = i;
            if(primePair[1] - primePair[0] == g)
                return primePair;
            primePair[0] = primePair[1];
        }
        return null;
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

    private boolean isPrime(long number){
        for(long i = 2; i <= number; i++ ){
            if(number % i == 0 && i != number)
                return false;
        }
        return true;
    }
}
