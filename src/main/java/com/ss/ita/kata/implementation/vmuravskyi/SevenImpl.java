package com.ss.ita.kata.implementation.vmuravskyi;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sumaVsixDonations = 0;
        for (int i = 0; i < arr.length; i++) {
            sumaVsixDonations += arr[i];
        }
        double result = Math.ceil((navg * (arr.length + 1)) - sumaVsixDonations);
        if (result <= 0) throw new IllegalArgumentException();
        return (long) result;
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double result = 1.00;
        double multiplier = 1.00;
        int difference = 4;
        for (int i = 1; i < n; i++) {
            result = result + (multiplier / difference);
            difference = difference + 3;
        }

        String res = String.format("%.2f",result);
        return String.valueOf(res);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if((p-bef)<= aft){
            return p-bef;
        }
        else {
            return aft+1;
        }
    }
}
