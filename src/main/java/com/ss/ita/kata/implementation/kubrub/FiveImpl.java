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
        List<Integer> list = new ArrayList<Integer>();
        long[] arr = new long[list.size()];
        for(int number = (int) m; number < n + 1; number++){
            if (isPrime(number) && isPrime(number+g)){
                list.add(number);
                list.add(number);
                break;
            }
        }
        for(int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }

    @Override
    public int zeros(int n) {
        int q = n;
        int zeros = 0;

        while (q != 0){
            q /= 5;
            zeros += q;
        }
        return zeros;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int temp = 0;
        int m = n.intValue();
        int[] f = new int[m];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < m; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for(int i = 0; i < f.length; i++){
            temp += f[i];
        }

        temp *= 4;
        BigInteger res = BigInteger.valueOf(temp);
        return res;
    }

    @Override
    public double solveSum(double m) {
        return (2 * m + 1 - Math.sqrt(4 * m + 1)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
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
