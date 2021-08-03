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
        List<Integer> multipliers = new LinkedList<>();
        for(int i = 1; i <= n; i++)
            multipliers.add(i);
        return findZeros(multipliers);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
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
