package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if(p<=0 || bef == 0 || aft ==0){
            return 0;
        }
        return Math.min(p - bef, aft + 1);
    }
}
