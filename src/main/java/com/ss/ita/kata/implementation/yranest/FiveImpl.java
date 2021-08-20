package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if(v.length==0){
            return 0;
        }
        int left = 0, area = 0, record = 1;
        for(int i = 1; i < v.length; i++){
            if(v[i] < v[i - 1]) left = i;
            else if(v[i] > v[i-1]){
                if(area > record)
                    area = area;
                else
                    area = record;
                record = i - left;
            }
            record++;
        }
        if(area>record)
            return area;
        else
            return record;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] arrOfPrime = new long[2];
        for (long i = m; i <= n; i++) {
            if (primeNumber(i)) {
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

    @Override
    public int zeros(int n) {
        if(n<=0) return -1;
        int res=0;
        while(n>0){
            n/=5;
            res += n;
        }
        return res;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        if (n.intValue() <= 0)
            return BigInteger.valueOf(0);
        BigInteger sum = BigInteger.valueOf(0);
        int k = n.intValue()+1;
        BigInteger [] array = new BigInteger[k];
        array[0]= BigInteger.valueOf(1);
        array[1]= BigInteger.valueOf(1);
        for(int i = 2; i<k; i++){
            array[i]=array[i-1].add(array[i-2]);
        }
        for(int i=0;i<k;i++){
            sum = sum.add(array[i]);
        }
        sum = sum.multiply(BigInteger.valueOf(4));
        return sum;
    }

    @Override
    public double solveSum(double m) {
        return -(-2*m + Math.sqrt(4*m + 1) - 1)/(2*m);
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

    private  boolean primeNumber(long number) {
        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}