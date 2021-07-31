package com.ss.ita.kata.implementation.maxde1;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        long n=0;
        long sum = 0;
        while(sum < m){
            n+=1;
            sum += (n*n*n);
        }

        if (sum == m){
            return n;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        String[] words = book.replaceAll("([^\\n. \\da-zA-Z])", "").replaceAll(" \\s{1}+", " ").split(" |\n");
        for (String s: words){
            System.out.println(s);
        }
        String extraSymbol = "\\r\\n";
        StringBuilder result = new StringBuilder("Original Balance: "+words[0]+extraSymbol);
        double sumOfBalance = Double.parseDouble(words[0]);
        int check=0;
        double count = 0;
        double totalExpense= 0;

        for (int i = 1; i < words.length; i++){
            check +=1;
            result.append(words[i]+" ");
            if (check==3){
                sumOfBalance -= Double.parseDouble(words[i]);
                totalExpense += Double.parseDouble(words[i]);
                result.append("Balance "+String.format("%.2f", (sumOfBalance))+extraSymbol);
                check = 0;
                count+=1;
            }
        }
        result.append("Total expense  "+String.format("%.2f", totalExpense)+extraSymbol);
        result.append("Average expense  "+String.format("%.2f", totalExpense/count));
        return result.toString();
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
