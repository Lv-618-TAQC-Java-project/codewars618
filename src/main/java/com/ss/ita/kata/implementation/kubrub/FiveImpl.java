package com.ss.ita.kata.implementation.kubrub;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    static boolean canGoLeft(int[] v, int i) {
        if (i == 0)
            return false;
        return v[i - 1] <= v[i];
    }

    static boolean canGoRight(int[] v, int i) {
        if (v.length - 1 == i)
            return false;
        return v[i + 1] <= v[i];

    }


    static int[] calculateTheLeftSide(int[] v) {
        int[] result = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            if (canGoLeft(v, i)) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    static int[] calculateTheRightSide(int[] v) {
        int[] result = new int[v.length];

        for (int i = v.length - 1; i >= 0; i--) {
            if (canGoRight(v, i)) {
                result[i] = result[i + 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }
    @Override
    public int artificialRain(int[] v) {
        int[] flowRight = calculateTheRightSide(v);
        int[] flowLeft = calculateTheLeftSide(v);

        int maxWateredPlains = 0;

        for (int i = 0; i < flowLeft.length; i++) {
            maxWateredPlains = Math.max(flowLeft[i] + flowRight[i] + 1, maxWateredPlains);
        }
        return maxWateredPlains;
    }


    public static boolean isPrime (int num){
        double squareNum = Math.pow(num, 0.5);
        for (int i = 2; i < squareNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public long[] gap(int g, long m, long n) {
        long previousPrimeNumber = -1;
        for(long i = m; i <= n; i++) {
            if(isPrime((int) i)) {
                if((i - previousPrimeNumber) == g) {
                    System.out.println(i - previousPrimeNumber);
                    long[] pairOfPrime = {previousPrimeNumber, i};
                    return pairOfPrime;
                }
                previousPrimeNumber = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        if (n <= 0){
            return -1;
        }
        int temp = n;
        int zeros = 0;

        while (temp != 0){
            temp /= 5;
            zeros += temp;
        }
        return zeros;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        if (n.intValue() <= 0){
            return BigInteger.ZERO;
        }
        BigInteger[] f = new BigInteger[2];
        f[0] = BigInteger.valueOf(1);
        f[1] = BigInteger.valueOf(1);
        BigInteger res = BigInteger.valueOf(0);
        for (int i = 1; i <= n.intValue() + 1; i++) {
            res = res.add(BigInteger.valueOf(
                            f[0].intValue())
                    .multiply(BigInteger.valueOf(4)));
            BigInteger buff = BigInteger.valueOf(f[1].intValue());
            f[1] = f[1].add(f[0]);
            f[0] = buff;
        }
        return res;
    }

    @Override
    public double solveSum(double m) {
        return (2 * m + 1 - Math.sqrt(4 * m + 1)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        if(n <= 0){
            return new long[]{};
        }
        String number = Long.toString(n);
        long minNumber = n;
        long firstNumber = 0;
        long secondNumber = 0;

        for (int j = 0; j < number.length(); j++){
            char theSmallestChar = number.charAt(j);
            String numberCopy = number.substring(0,j) + number.substring(j+1);
            for (int i = 0; i < number.length(); i++){
                int k = 0;
                char[] temp = new char[number.length()];
                for(; k < i; k++){
                    temp[k] = numberCopy.charAt(k);
                }

                temp[k++] = theSmallestChar;

                for(; k < number.length(); k++){
                    temp[k] = numberCopy.charAt(k - 1);
                }
                if(Long.valueOf(String.valueOf(temp)) < minNumber){
                    minNumber = Long.valueOf(String.valueOf(temp));
                    firstNumber = j;
                    secondNumber = i;
                }
            }
        }
        return new long[]{minNumber, firstNumber,secondNumber};
    }
}