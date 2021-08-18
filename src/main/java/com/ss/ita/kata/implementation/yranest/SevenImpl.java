package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        long ans = (long) Math.ceil((arr.length + 1) * navg - sum);
        if (ans <= 0) throw new IllegalArgumentException();
        return ans;
    }

    @Override
    public String seriesSum(int n) {
            double result = 1;
            int baseNum = 1;
            if (n <= 0) return "0.00";
            else {
                for (int i = 1; i < n; i++) {
                    baseNum = baseNum + 3;
                    result += 1.0 / baseNum;
                }
            }
            return Double.toString((double) (Math.round(result*100D)/100D));
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int count=0;
        int a=0;
        int b=0;
        for(int i=1;i<=p;i++)
        {
            a=i-1;
            b=p-i;
            if(a>=bef&&b<=aft)
            {
                count++;
            }
        }
        return count;
    }
}
