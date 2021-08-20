package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Six;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        if (m <= 0)
            return -1L;
        double n = (double) ((-1 + Math.sqrt(1+8*Math.sqrt(m)))/2);
        if(n % 1 != 0){
            return -1;
        }
        return (long) n;
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
        if(x <= 0){
            return -1;
        }
        return x / (1.0 + Math.sqrt(1.0 + x));
    }

    @Override
    public double mean(String town, String strng) {
        String[] values = getArrayOfValues(town, strng);
        if (values.length == 0) {
            return -1;
        }
        double sum = 0;

        for (String el: values) {
            sum += Double.parseDouble(el);
        }

        return sum/12;
    }


    @Override
    public double variance(String town, String strng) {
        String[] values = getArrayOfValues(town, strng);
        double mean = mean(town, strng);
        if (values.length == 0) {
            return -1;
        }
        double squareSum = 0;

        for (String el: values) {
            squareSum += Math.pow((Double.parseDouble(el) - mean), 2);
        }

        return squareSum/12;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.equals("")) return toFind + ":This team didn't play!";
        String[] listOfTeams = new String[]{"Los Angeles Clippers", "Dallas Mavericks", "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Memphis Grizzlies",
                "Los Angeles Lakers", "Minnesota Timberwolves", "Phoenix Suns", "Portland Trail Blazers", "New Orleans Pelicans",
                "Sacramento Kings", "Los Angeles Clippers", "Houston Rockets", "Denver Nuggets", "Cleveland Cavaliers", "Milwaukee Bucks",
                "Oklahoma City Thunder", "San Antonio Spurs", "Boston Celtics", "Philadelphia 76ers", "Brooklyn Nets", "Chicago Bulls",
                "Detroit Pistons", "Utah Jazz", "Miami Heat", "Charlotte Hornets", "Toronto Raptors", "Orlando Magic", "Washington Wizards",
                "Golden State Warriors"};
        if (!Arrays.asList(listOfTeams).contains(toFind)) return toFind + ":This team didn't play!";
        String[] pairs = resultSheet.split(",");
        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        for (String s : pairs) {
            if (s.contains(".")) return "Error(float number):" + s;
            if (s.contains(toFind)) {
                int first = Integer.parseInt(s.substring(0, s.length() - 10).replaceAll("[\\D]", ""));
                String reversed = new StringBuilder(s).reverse().toString();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < reversed.length(); i++) {
                    if (Character.isDigit(reversed.charAt(i))) {
                        sb.insert(i, reversed.charAt(i));
                    } else {
                        break;
                    }
                }
                int second = Integer.parseInt(sb.reverse().toString());

                if (s.contains(toFind + " " + first)) {
                    scored += first;
                    conceded += second;
                    if (first > second) {
                        points += 3;
                        wins++;
                    }
                    if (first == second) {
                        points += 1;
                        draws++;
                    }
                    if (first < second) {
                        loses++;
                    }
                }
                if (s.contains(toFind + " " + second)) {
                    scored += second;
                    conceded += first;
                    if (second > first) {
                        points += 3;
                        wins++;
                    }
                    if (first == second) {
                        points += 1;
                        draws++;
                    }
                    if (second < first) {
                        loses++;
                    }
                }
            }
        }

        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + loses +
                ";Scored=" + scored + ";Conceded=" + conceded +
                ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }

        String result = "-";
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();

        for(String letter:lstOf1stLetter) {
            data.put(letter.charAt(0), 0);
        }

        for(String books:lstOfArt) {
            char firstL = books.charAt(0);
            int numberOfBooks = Integer.parseInt(books.split(" ")[1]);

            if(data.containsKey(firstL)) {
                data.replace(firstL, data.get(firstL) + numberOfBooks);
            }
        }

        for(HashMap.Entry entry: data.entrySet()){
            result += "- (" + entry.getKey() + " : " + entry.getValue() + ") ";
        }


        return result.substring(3, result.length() - 1);
    }
    private String[] getArrayOfValues(String town, String strng) {
        String[] arrayOfValues = new String[12];
        String[] arrayOfTowns = strng.split("\n");

        for (int i = 0; i < arrayOfTowns.length; i++) {
            if (arrayOfTowns[i].substring(0, arrayOfTowns[i].indexOf(":")).equals(town)) {
                arrayOfValues = arrayOfTowns[i]
                        .replaceAll("[^\\d.]", " ")
                        .trim()
                        .replaceAll(" +", " ")
                        .split(" ");
                break;
            } else if (i == arrayOfTowns.length - 1) {
                return new String[0];
            }
        }
        return arrayOfValues;
    }
}
