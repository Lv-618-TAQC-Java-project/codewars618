package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

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
        if (m >= n)
            return null;
        long[] primePair = new long[2];
        for (long i = m; i <= n; i++) {
            if(isPrime(i)) {
                primePair[0] = i;
                primePair[1] = i;
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
        if (primePair[0] == primePair[1])
            return null;
        return primePair;
    }

    @Override
    public int zeros(int n) {
        if (n <= 0)
            return -1;
        List<Integer> multipliers = new LinkedList<>();
        for(int i = 1; i <= n; i++)
            multipliers.add(i);
        return findZeros(multipliers);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        if (n.intValue() <= 0)
            return BigInteger.ZERO;
        BigInteger[] fibonacciPair = new BigInteger[2];
        fibonacciPair[0] = BigInteger.valueOf(1);
        fibonacciPair[1] = BigInteger.valueOf(1);
        BigInteger result = BigInteger.valueOf(0);
        for (int i = 1; i <= n.intValue() + 1; i++) {
            result = result.add(BigInteger.valueOf(
                    fibonacciPair[0].intValue())
                    .multiply(BigInteger.valueOf(4)));
            BigInteger buff = BigInteger.valueOf(fibonacciPair[1].intValue());
            fibonacciPair[1] = fibonacciPair[1].add(fibonacciPair[0]);
            fibonacciPair[0] = buff;
        }
        return result;
    }

    @Override
    public double solveSum(double m) {
        double sqrtD = Math.sqrt((2 * m + 1) * (2 * m + 1) - 4 * m * m);
        double x = (2 * m + 1 - sqrtD) / (2 * m);
        if(x > 0 && x < 1)
            return x;
        x = (2 * m + 1 + sqrtD) / (2 * m);
        if(x > 0 && x < 1)
            return x;
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        if (n <= 0)
            return new long[0];
        String number = Long.toString(n);
        long minValue = n;
        long first = 0;
        long second = 0;
        for (int j = 0; j < number.length(); j++) {
            char smallestChar = number.charAt(j);
            String numberCopy = number.substring(0, j) + number.substring(j + 1);
            for (int i = 0; i < number.length(); i++) {
                int k = 0;
                char[] temp = new char[number.length()];
                for ( ; k < i; k++)
                    temp[k] = numberCopy.charAt(k);

                temp [k++] = smallestChar;

                for( ;k < number.length(); k++)
                    temp[k] = numberCopy.charAt(k - 1);

                if(Long.valueOf(String.valueOf(temp)) < minValue){
                    minValue = Long.valueOf(String.valueOf(temp));
                    first = j;
                    second = i;
                }
            }
        }
        return new long[]{minValue, first, second};
    }

    private boolean isPrime(long number){
        for(long i = 2; i <= number; i++ ){
            if(number % i == 0 && i != number)
                return false;
        }
        return true;
    }

    private int divideByTen(int divider){
        int times = 0;
        while (divider % 10 == 0){
            divider /= 10;
            times++;
        }
        return times;
    }
    private int findZeros(List<Integer> multipliers){
        int zeros = 0;
        for(int i = 0; i < multipliers.size(); i++){
            if(multipliers.get(i) % 10 == 0) {
                zeros += divideByTen(multipliers.get(i));
                multipliers.remove(i);
                continue;
            }
            if(i == multipliers.size() - 1)
                break;
            for (int j = i + 1; j < multipliers.size(); j++) {
                if(multipliers.get(i) * multipliers.get(j) % 10 == 0){
                    zeros += divideByTen(multipliers.get(i) * multipliers.get(j));
                    multipliers.remove(i);
                    multipliers.remove(j-1);
                }
            }
        }
        if (zeros == 0)
            return 0;
        return zeros + findZeros(multipliers);
    }
}
