package com.ss.ita.kata.implementation.kubrub;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 1;
        long res = 0;
        while (res < m){
            res += Math.pow(n,3);;

            if (res == m){
                return n;
            }
            n++;
        }
        return -1;
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
        if (x <= 0){
            return -1;
        }
        double res = x / (1.0 + Math.sqrt(1.0 + x));
        return res;
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
        String[] arr = strng.split("\n");
        double sum = 0;
        double mean = mean(town, strng);
        String temp = "";
        String line = "";
        for (String s: arr){
            temp = s;
            if (town.equals(temp.split(":")[0])){
                line = s;
                break;
            }
        }

        if (line.length() == 0 || line.length() == town.length()){
            return -1;
        }

        String[] res = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");
        for (String s: res){
            sum += Math.pow((Double.parseDouble(s) - mean), 2);
        }
        return sum/res.length;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 | lstOf1stLetter.length == 0){
            return "";
        }
        StringBuilder res = new StringBuilder();
        int sum =0;

        for (String s: lstOf1stLetter){
            for (String j: lstOfArt){
                if (j.startsWith(s)){
                    sum +=  Integer.parseInt(j.split(" ")[1]);
                }
            }
            res.append("("+s+" : "+sum+") - ");
            sum = 0;
        }
        return res.toString().substring(0, res.toString().length()-3);
    }
}