package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long cubeNumber = 0;
        for ( long i = 1; m > 0 ; i++){
            m -= i * i * i;
            cubeNumber++;
        }
        return m == 0 ? cubeNumber : -1L;
    }

    @Override
    public String balance(String book) {
        String[] lines = getCleanStringArray(book);
int j = 1;
        double balance = Double.parseDouble(lines[0]);
        double currentBalance = balance;
        StringBuilder sb = new StringBuilder();
        sb.append("Original_Balance:_" + String.format( "%.2f", balance) + "\n");
        for (int i = 1; i < lines.length; i ++){
            String[] temp = lines[i].split(" ");
            if (temp.length != 3)
                return null;
            currentBalance -= Double.parseDouble(temp[2]);
            String newLine = lines[i].replace(" ", "_");
            sb.append(newLine);
            sb.append("_Balance_" + String.format( "%.2f", currentBalance) + "\n");
        }
        sb.append("Total_expence_" + String.format( "%.2f", balance-currentBalance) + "\n");
        sb.append("Average_expence_" + String.format( "%.2f", (balance-currentBalance) / (lines.length - 1)) );
        return sb.toString();
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

    private String[] getCleanStringArray(String book){
        String[] lines = book.split("\n");
        List<String> list = new ArrayList<>();
        for (String x : lines) {
            if (x.isEmpty() == false) {
//                String s = x.replaceAll("(\\W)", "");
                list.add(x);
            }
        }
        lines = new String[list.size()];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = list.get(i);
        }
        return lines;
    }
}
