package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Six;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.StringJoiner;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        if (m <= 0)
            return -1L;
        long sum = 0;
        long n = 0;
        while(sum < m){
            n = n + 1;
            sum +=  n * n * n;
        }
        if(sum == m){
            return n;
        }
        else
            return -1;
    }

    @Override
    public String balance(String book) {
        String[] lines = book.split("\n");
        StringJoiner joiner = new StringJoiner("\\r\\n");

        double sum = 0.0;
        double avgSum = 0.0;
        int linesCount = 0;
        double leftOver = -1.0;

        for (int i = 0; i < lines.length; i++) {

            if (!"".equals(lines[i])) {
                String line = lines[i].replaceAll("[^0-9a-zA-Z\\s\\.]","");

                if (leftOver == -1) {
                    leftOver = Double.valueOf(line.trim());
                    joiner.add(String.format("Original Balance: %.2f", leftOver));
                } else {

                    String[] lineParts = line.split(" ", 3);
                    if (lineParts.length > 1) {
                        double value = Double.valueOf(lineParts[2].trim());
                        sum += value;
                        leftOver -= value;
                        linesCount++;

                        joiner.add(
                                String.format("%s %s %.2f Balance %.2f", lineParts[0], lineParts[1], value, round(leftOver))
                        );
                    }
                }
            }
        }

        return joiner.add(String.format("Total expense  %.2f", round(sum)))
                .add(String.format("Average expense  %.2f", round(sum / linesCount)))
                .toString();
    }

    private static double round(double value) {
        BigDecimal result = new BigDecimal(value);
        result = result.setScale(2, RoundingMode.HALF_UP);
        return result.doubleValue();
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
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
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
        int sum = 0;
        boolean hasRunOnce = false;
        String stock = "";
        if(lstOfArt.length ==0 || lstOf1stLetter.length ==0){
            stock="";
        }

        else{
            for(int i = 0; i < lstOf1stLetter.length; i++) {
                for(int j = 0; j < lstOfArt.length; j++) {
                    if(lstOf1stLetter[i].charAt(0) == lstOfArt[j].charAt(0)) {
                        sum += Integer.parseInt(lstOfArt[j].substring(lstOfArt[j].indexOf(" ") + 1));
                    }
                    if(j == lstOfArt.length - 1) {
                        if(!hasRunOnce) {
                            stock += "(" + lstOf1stLetter[i] + " : " + sum + ")";
                            sum = 0;
                            hasRunOnce = true;
                        }
                        else {
                            stock += " - (" + lstOf1stLetter[i] + " : " + sum + ")";
                            sum = 0;
                        }
                    }
                }
            }
        }
        return stock;
    }
}
