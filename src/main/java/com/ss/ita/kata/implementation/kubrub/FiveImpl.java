//package com.ss.ita.kata.implementation.kubrub;
//
//import com.ss.ita.kata.Five;
//
//import java.math.BigInteger;
//
//public class FiveImpl implements Five {
//    @Override
//    public int artificialRain(int[] v) {
//        return 0;
//    }
//
//    @Override
//    public static boolean isPrime (int num){
//        double squareNum = Math.pow(num, 0.5);
//        for (int i = 2; i < squareNum; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public long[] gap(int g, long m, long n) {
//        List<Integer> list = new ArrayList<Integer>();
//        for(int number = (int) m; number < n + 1; number++){
//            if (isPrime(number) && isPrime(number+g)){
//                list.add(number);
//                list.add(number);
//                break;
//            }
//        }
//
//        return list;
//    }
//
//    @Override
//    public int zeros(int n) {
//        int q = n;
//        int zeros = 0;
//
//        while (q != 0){
//            q /= 5;
//            zeros += q;
//        }
//        return zeros;
//    }
//
//    @Override
//    public BigInteger perimeter(BigInteger n) {
//        int res = 0;
//        int[] f = new int[n];
//        f[0] = 1;
//        f[1] = 1;
//        for (int i = 2; i < n; ++i) {
//            f[i] = f[i - 1] + f[i - 2];
//        }
//
//        for(int i = 0; i < f.length; i++){
//            res += f[i];
//        }
//
//        res *= 4;
//        return res;
//    }
//
//    @Override
//    public double solveSum(double m) {
//        return (2 * m + 1 - Math.sqrt(4 * m + 1)) / (2 * m);
//    }
//
//    @Override
//    public long[] smallest(long n) {
//        return new long[0];
//    }
//}
