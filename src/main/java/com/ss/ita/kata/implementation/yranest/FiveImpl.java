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
        long max = 0;
        long[] array = new long[2];
        for (long i = m; i < n; i++) {
            if (primeNumber(i)) {
                array[0] = i;
            }

            for (long j = array[0] + 1; j < n; j++) {
                if (primeNumber(j)) {
                    array[1] = j;
                }
                if (array[1] - array[0] == g && max == 0) {
                    max = array[0];
                }

            }
        }
        array[0] = max;
        array[1] = array[0] + g;
        if (max != 0)
            return array;
        else
            return null;
    }

    @Override
    public int zeros(int n) {
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
        long variable2 = 0;
        long variable = 0;
        long position = 0;
        long secondPosition = 0;
        long [] mas = new long[3];
        String str = Integer.toString((int)n);
        long []array = new long[str.length()];
        for (int i = array.length- 1; i >= 0; i--){
            array[i]=n%10;
            n/=10;
        }
        long min = array[0];
        long min1 = array[0];
        for(int i=0;i<array.length;i++){
            if(min>=array[i]) {
                min = array[i];
                position = i;
                min1 = array[i];
            }
        }
        if(min==array[0]&&position==0){
            min = array[1];
            for(int i=1;i<array.length;i++){
                if(min>=array[i]) {
                    min = array[i];
                    position = i;
                    System.out.println(min);
                }
            }
        }
        long first = array[0];
        long pos = array[(int)position];
        for (int i=(int)position;i>=0;i--) {
            if (min>min1) {
                System.out.println("1'");
                if (i == 1) {
                    array[i] = min;
                    secondPosition =i;
                    variable2=secondPosition;

                }

                else if(i==0)
                    continue;
                else
                    array[i] = array[i - 1];

            }
            else if(array[1]==0){
                variable = array[0];
                array[0]=array[1];
                array[1]=variable;
                position = 0;
                secondPosition = 1;
                variable2=secondPosition;
            }
            else if(min<=min1 && array[0]!=0){
                if (i == 0) {
                    array[i] = min1;
                    secondPosition =i;
                    variable2=secondPosition;
                }
                else if (i == 1)
                    array[i] = first;
                else
                    array[i] = array[i - 1];
            }
        }

        String str1 = "";
        int k=0;
        Integer g =0;
        for (int i=0;i<array.length;i++){
            k = (int)array[i];
            g=Integer.valueOf(k);
            str1+= g.toString();

        }
        long answer = Long.valueOf(str1);
        mas[0]=answer;
        mas[1]=position;
        mas[2]=variable2;
        return mas;

    }

    private  boolean primeNumber(long number) {
        for (int mod = 2; mod < Math.sqrt(number); ++mod) {
            if (number % mod == 0) {
                return false;
            }
        }

        return true;
    }
}