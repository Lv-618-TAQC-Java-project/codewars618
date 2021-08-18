package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        if (m == 0)
            return -1L;
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
        sb.append("Total_expense_" + String.format( "%.2f", balance-currentBalance) + "\n");
        sb.append("Average_expense_" + String.format( "%.2f", (balance-currentBalance) / (lines.length - 1)) );
        return sb.toString();
    }

    @Override
    public double f(double x) {
        return x/(1.0 + Math.sqrt(1.0 + x));
    }

    @Override
    public double mean(String town, String strng) {
        double[] values = getDoubleArrayFromData(town,strng);

        if (values == null)
            return -1.0;
        return Arrays.stream(values).average().getAsDouble();


    }

    @Override
    public double variance(String town, String strng) {
        double[] values = getDoubleArrayFromData(town,strng);
        if (values == null)
            return -1.0;
        double meanValue = mean(town, strng);

        return Arrays.stream(values)
                .map( x -> x = (x - meanValue) * (x - meanValue))
                .sum() / values.length;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        String[] matchesOfTeam = getMatchesOfTeam(resultSheet, toFind + " ");
        if (matchesOfTeam.length == 0 || toFind.isEmpty())
            return toFind + ":This team didn't play!";
        int totalScore = 0;
        int totalOpponents = 0;
        int wins = 0;
        int draws = 0;
        int loses = 0;
        for (String x:
             matchesOfTeam) {
            int[] scores = findNumbers(x);
            if (x.startsWith(toFind)){
                totalScore += scores[0];
                totalOpponents += scores[1];
                if(scores[0] > scores[1]) {
                    wins++;
                    continue;
                }
                if(scores[0] == scores[1]) {
                    draws++;
                    continue;
                }
                loses++;
            }
            else {
                totalScore += scores[1];
                totalOpponents += scores[0];
                if(scores[1] > scores[0]) {
                    wins++;
                    continue;
                }
                if(scores[1] == scores[0]){
                    draws++;
                    continue;
                }
                loses++;
            }
        }
        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + totalScore +
                ";Conceded=" + totalOpponents +";Points=" + (wins * 3 + draws);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";
        int[] quality = new int[lstOf1stLetter.length];
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            for (int j = 0; j < lstOfArt.length; j++) {
                if(lstOfArt[j].charAt(0) == lstOf1stLetter[i].charAt(0)){
                    String[] temp = lstOfArt[j].split(" ");
                    quality[i] += Integer.parseInt(temp[1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < quality.length - 1; i++)
            sb.append("(" + lstOf1stLetter[i] + " : " + quality[i] + ") - ");
        sb.append("(" + lstOf1stLetter[lstOf1stLetter.length - 1] + " : " + quality[quality.length - 1] + ")");
        return sb.toString();
    }

    private String[] getCleanStringArray(String book){
        String[] lines = book.split("\n");
        List<String> list = new ArrayList<>();
        for (String x : lines) {
            if (x.isEmpty() == false) {
                String s = x.replaceAll("[^\\da-zA-Z .]", "");
                list.add(s);
            }
        }
        lines = new String[list.size()];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = list.get(i);
        }
        return lines;
    }
    private double[] getDoubleArrayFromData(String town, String strng){
        String[] lines = strng.split("\n");
        String cityInfo = null;
        for (String x:
                lines) {
            if(x.startsWith(town))
                cityInfo = x.substring(town.length() + 1);
        }
        if(cityInfo == null)
            return null;
        String[] temp = cityInfo.split("[ ,]");
        double[] values = new double[12];
        for (int i = 1, j = 0; i < temp.length; i += 2, j ++) {
            values[j] = Double.parseDouble(temp[i]);
        }
        return values;
    }

    private String[] getMatchesOfTeam(String resultSheet, String toFind){
        String[] matches = resultSheet.split(",");
        List<String> list = new ArrayList<>();
        for (String x : matches) {
            if (x.contains(toFind)) {
                list.add(x);
            }
        }
        String[] matchesOfTeam  = new String[list.size()];
        for (int i = 0; i < matchesOfTeam.length; i++) {
            matchesOfTeam[i] = list.get(i);
        }
        return matchesOfTeam;
    }

    private int[] findNumbers(String str){
        int[] scores = new int[2];
        int[] range = findNumberIndexes(str,0);
        if(str.charAt(range[0] -1) != ' ' || str.charAt(range[1]) != ' ')
            range = findNumberIndexes(str,range[1]);
        scores[0] = Integer.parseInt(str.substring(range[0], range[1]));
        range = findNumberIndexes(str,range[1]);
        if(str.charAt(range[0] - 1) != ' ' || range[1] != str.length() -1 )
            range = findNumberIndexes(str,range[1]);
        scores[1] = Integer.parseInt(str.substring(range[0]));
        return scores;
    }

    private int[] findNumberIndexes(String str, int start){
        int[] range = new int[2];
        range[0] = start;
        while (!Character.isDigit(str.charAt(range[0])))
            range[0]++;
        range[1] = range[0];
        while (range[1] < str.length() - 1 && Character.isDigit(str.charAt(range[1])))
            range[1]++;
        return range;
    }
}
