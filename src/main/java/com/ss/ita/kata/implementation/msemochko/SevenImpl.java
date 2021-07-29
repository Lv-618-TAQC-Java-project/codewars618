package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Seven;


public class SevenImpl implements Seven {
    public static void main(String[] args) {
        SevenImpl seven = new SevenImpl();
        double[] arr = new double[]{14, 30, 5, 7, 9, 11, 15};
        seven.newAvg(arr, 30);
    }
    @Override
    public long newAvg(double[] arr, double navg) {
        double sumOfNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfNumbers += arr[i];
        }
        int unknown = ((int) ((navg * (arr.length+1)) - sumOfNumbers));
        return unknown;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
