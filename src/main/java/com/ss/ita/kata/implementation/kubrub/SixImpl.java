package com.ss.ita.kata.implementation.kubrub;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        int n = 1;
        int res = 0;
        while (res != m){
            res = 0;
            n++;
            for(int i = n; i > 0;i--){
                res += Math.pow(i,3);
            }
        }
        return res;

    }

    @Override
    public String balance(String book) {
        String[] arr = book.split(" ");

        double k = Integer.parseInt(arr[0]);
        double res = k;
        int n = 0;
        String finalResult = "Original_Balance:_" + res + "\n";

        for(int i = 1; i < arr.length; i+=3){
            n+=1;
            res-= Double.parseDouble(arr[i+2]);
            System.out.print(arr[i] + "_" + arr[i+1] + "_" +arr[i+2] + "_Balance_" + String.format ("%.2f", res) + "\n");
        }


        k -= res;
        String result = String.format("%.2f", res );

        k /= n;
        String result2 =  String.format("%.2f",k );

        finalResult += "Total_expense__" + result + "\n" + "Average_expense__" + result2;

        return finalResult;
    }

    @Override
    public double f(double x) {
        double res = x / (1.0 + Math.sqrt(1.0 + x));
        return res;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
