package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;

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
        long[] result = new long[2];
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        BigInteger number = new BigInteger(String.valueOf(m));

        while (m <= n) {
            number = BigInteger.valueOf(m);
            if (number.isProbablePrime((int) m)) {
                primeNumbers.add((int) m);
            }
            m++;
        }
        for (int i = 0; i < (primeNumbers.size() - 1); i++) {
            if (primeNumbers.get(i + 1) - primeNumbers.get(i) == g) {
                result[0] = primeNumbers.get(i);
                result[1] = primeNumbers.get(i + 1);
                break;
            }
        }
        return result;
    }

    @Override
    public int zeros(int n) {
        return 0;
    }
    public static int[] fibArr(int n){
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n+1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
    @Override
    public BigInteger perimeter(BigInteger n) {
        if (n.intValue()<=0){
            return BigInteger.valueOf(0);
        }
        int[] fibNum = fibArr(n.intValue());
        int result = 0;
        for (int i = 0; i < fibNum.length; i++) {
            result += fibNum[i]*4;
        }
        return BigInteger.valueOf(result);
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
