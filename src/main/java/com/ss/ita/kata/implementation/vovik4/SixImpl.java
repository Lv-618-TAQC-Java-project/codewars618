package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String result = book;
        String [] arr = result.split("\\\n");
        double sum = 1000;
        double totalExpense = 0;
        String resultLine = "";
        String firstLine = arr[0].replaceAll("[^0-9]\\.|\\.[^0-9]|[^0-9.\\s]","");
        firstLine = "Original_Balance:_" + firstLine + "*";


        for (int i = 1; i < arr.length; i++) {
            String arrString = arr[i];
            String Number = arrString.replaceFirst("[^0-9]+","*");
            String Category = arrString.replaceAll("[^a-zA-Z]+","");
            Pattern pattern = Pattern.compile("([0-9]+\\.[0-9]+|[0-9]+)");
            Matcher matcher = pattern.matcher(Number);
            int k = 1;
            String tempLine = "";
            while (matcher.find()){
                if(k%2==0){
                    double cost = Double.parseDouble(matcher.group());
                    sum = sum - cost;
                    sum = (double)(Math.round(sum*100)/100D);
                    tempLine = tempLine + sum;
                    totalExpense += cost;
                }else{
                    tempLine = matcher.group() + tempLine + " " + Category + " " ;
                }
                k++;
            }
            tempLine +="*";
            resultLine += tempLine;
        }
        totalExpense = (double)(Math.round(totalExpense*100)/100D);
        double averageExpense = totalExpense/(arr.length-1);
        averageExpense = (double)(Math.round(averageExpense*100)/100D);

        String LineTotalExpense = "Total expense  " + totalExpense + "*";
        String LineAverageExpense = "Average expense  " + averageExpense + "*";

        resultLine = firstLine + resultLine;
        resultLine += LineTotalExpense;
        resultLine += LineAverageExpense;
        resultLine = resultLine.replaceAll("\\*","\\\r\\\n");

        return resultLine;
    }

    @Override
    public double f(double x) {
        return 0;
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
