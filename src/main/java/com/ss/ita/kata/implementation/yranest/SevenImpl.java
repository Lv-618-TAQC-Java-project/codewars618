package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
            float result = 1.0f;
            float baseNum = 1.0f;
            if (n <= 0) result = 0;
            else {
                for (int i = 1; i < n; i++) {
                    baseNum = baseNum + 3;
                    result += 1.0 / baseNum;
                }
            }
            return String.format("%.2f", result);
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
