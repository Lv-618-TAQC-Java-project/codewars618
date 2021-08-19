package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if (v.length == 1) {
            return 1;
        }
        int maxSize = 0;
        int[] leftFall = new int[v.length];
        int[] rightFall = new int[v.length];

        for (int i = 1; i < v.length; i++)
            if (v[i - 1] <= v[i])
                leftFall[i] = leftFall[i - 1] + 1;

        for (int i = v.length - 2; i >= 0; i--)
            if (v[i + 1] <= v[i])
                rightFall[i] = rightFall[i + 1] + 1;

        for (int i = 0; i < v.length; i++) {
            int currentSize = leftFall[i] + rightFall[i] + 1;
            if (currentSize > maxSize)
                maxSize = currentSize;
        }
        return maxSize;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        if (m >= n) {
            return null;
        }
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
        if (result[0] == result[1])
            return null;
        return result;
    }

    public static long factorial(int num) {
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    @Override
    public int zeros(int n) {
        if (n<0){
            return -1;
        }
        int count = 0;

        long number = factorial(n);
        int numLength = String.valueOf(Math.abs(number)).length();

        for (int i = 0; i < numLength; i++) {
            if (number % 10 == 0) {
                count++;
                number = number / 10;
            } else {
                break;
            }
        }
        return count;
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
            return BigInteger.ZERO;
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
        return -(-2*m + Math.sqrt(4*m + 1) - 1)/(2*m);
    }

    @Override
    public long[] smallest(long n) {
        if (n <= 0) {
            return new long[0];
        }
        long minNum = n;
        long numberToCompare;
        int indexOfTakenNum = 0;
        int indexOfPlacedNum = 0;
        char numToReplace;

        char[] a = String.valueOf(n).toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                StringBuffer buff = new StringBuffer(String.valueOf(n));

                numToReplace = buff.charAt(i);
                buff.delete(i, i + 1);

                buff.insert(j, numToReplace);

                numberToCompare = Integer.parseInt(new String(buff));
                if (numberToCompare < minNum) {
                    minNum = numberToCompare;
                    indexOfTakenNum = i;
                    indexOfPlacedNum = j;

                }
            }
        }
        return new long[]{minNum, indexOfTakenNum, indexOfPlacedNum};
    }
}
