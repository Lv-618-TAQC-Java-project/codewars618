package com.ss.ita.kata.implementation.kubrub;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        public static boolean isPrime(int num){
            double squareNum = Math.pow(num, 0.5);
            for (int i = 2; i < squareNum; i++){
                if(num%i == 0){
                    return false;
                }
            }
            return true;
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int number = m; number < n + 1; number++){
            if (isPrime(number) && isPrime(number+g)){
                list.add(number);
                list.add(number);
                break;
            }
        }
        Long[] array = (Long[]) list.toArray(new Long[list.size()]);
        return array;

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
