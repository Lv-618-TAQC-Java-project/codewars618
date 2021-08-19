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
        return x / (1.0 + Math.sqrt(1.0 + x));
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || strng == null) {
            return -1;
        }
        String[] splitStrng = strng.split("\n");
        double sum =0;
        String line="";
        String temp = "";
        for (String s: splitStrng){
            temp = s;
            if (town.equals(temp.split(":")[0])){
                line = s;
                System.out.println(line);
                break;
            }
        }

        if (line.length() == 0){
            return -1;
        }
        String[] arrOfLine = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");
        for (String s: arrOfLine){
            sum+= Double.parseDouble(s);
        }
        return sum/(arrOfLine.length);
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || strng == null) {
            return -1;
        }
        String[] splitStrng = strng.split("\n");
        double sum =0;
        double mean = mean(town, strng);
        String temp = "";
        String line="";
        for (String s: splitStrng){
            temp = s;
            if (town.equals(temp.split(":")[0])){
                line = s;
                System.out.println(line);
                break;
            }
        }
        if (line.length() == 0 || line.length() == town.length()){
            return -1;
        }
        String[] arrOfLine = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");
        for (String s: arrOfLine){
            sum += Math.pow((Double.parseDouble(s)-mean), 2);
        }
        return sum/arrOfLine.length;
    }


    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return "";

    }




    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length==0 | lstOf1stLetter.length==0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        int sum =0;
        String currentCategory="";
        for (String s: lstOf1stLetter){
            for (String j: lstOfArt){
                if (j.startsWith(s)){
                    sum +=  Integer.parseInt(j.split(" ")[1]);
                }
            }
            result.append("("+s+" : "+sum+") - ");
            sum=0;
        }
        return result.toString().substring(0, result.toString().length()-3);
    }
}
