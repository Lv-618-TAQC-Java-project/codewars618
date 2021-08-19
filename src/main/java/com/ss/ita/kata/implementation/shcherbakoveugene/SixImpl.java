package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 1;
        long sum = 1;

        while (sum != m) {
            n++;
            sum += Math.pow(n, 3);
            if ((m - sum) < sum) {
                System.out.println("Maximum available Cubes: " + n);
                return -1;
            }
        }

        return n;
    }

    @Override
    public String balance(String book) {
        String[] arrayOfLines = book.split("\n");
        String[] properArrayOfLines = new String[arrayOfLines.length];
        StringBuilder result = new StringBuilder("");
        double balance;
        double totalExpense = 0;
        double avgExpense;

        properArrayOfLines[0] = arrayOfLines[0].replaceAll("[^\\d.]", "");
        for (int i = 1; i < properArrayOfLines.length; i++) {
            properArrayOfLines[i] = arrayOfLines[i].replaceAll("[^\\da-zA-Z .]", "")
                    .trim().replaceAll(" +", " ");
        }

        balance = Double.parseDouble(properArrayOfLines[0]);
        result.insert(0, "Original Balance: " + properArrayOfLines[0]);
        for (int i = 1; i < properArrayOfLines.length; i++) {
            balance -= Double.parseDouble(properArrayOfLines[i].split(" ")[2]);
            totalExpense += Double.parseDouble(properArrayOfLines[i].split(" ")[2]);
            result
                    .append("\n")
                    .append(properArrayOfLines[i])
                    .append(" Balance ")
                    .append(new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP));
        }

        avgExpense = totalExpense/(properArrayOfLines.length - 1);

        return result
                .append("\n")
                .append("Total expense  ")
                .append(new BigDecimal(totalExpense).setScale(2, RoundingMode.HALF_UP))
                .append("\n")
                .append("Average expense  ")
                .append(new BigDecimal(avgExpense).setScale(2, RoundingMode.HALF_UP))
                .toString();
    }

    @Override
    public double f(double x) {
        return x/(1.0 + Math.sqrt(1.0 + x));
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
        if (toFind.equals("")) {
            return "";
        }
        if (!isTeamExist(toFind))  {
            return toFind + ":This team didn't play!";
        }

        StringBuilder result = new StringBuilder(toFind);
        String[] results = resultSheet.split(",");
        List<String> teamGames = new ArrayList<>();

        for (String el: results) {
            if (el.contains(toFind)) {
                teamGames.add(el);
            }
        }
        String[] teamStatistic = teamStatistic(teamGames, toFind);
        if (teamStatistic.length == 4) {
            return Arrays.stream(teamStatistic).map(x -> x + "").collect(Collectors.joining());
        }

        return result
                .append(":W=")
                .append(teamStatistic[0])
                .append(";D=")
                .append(teamStatistic[1])
                .append(";L=")
                .append(teamStatistic[2])
                .append(";Scored=")
                .append(teamStatistic[3])
                .append(";Conceded=")
                .append(teamStatistic[4])
                .append(";Points=")
                .append(teamStatistic[5])
                .toString();
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        List<String> res = new ArrayList<>();

        for (String el: lstOf1stLetter) {
            int value = 0;
            for (String art: lstOfArt) {
                if (art.substring(0, 1).contains(el)) {
                    value += Integer.parseInt(art.replaceAll("\\D", ""));
                }
            }
            res.add("(" + el + " : " + value + ")");
        }
        StringBuilder sb = new StringBuilder(res
                .stream()
                .map(x -> x + " - ")
                .collect(Collectors
                        .joining()));

        return sb.delete(sb.length() - 3, sb.length() - 1).toString();
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

    private boolean isTeamExist(String teamName) {
        String teams = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,NYK,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
                + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
                + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
                + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
                + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
                + "Golden State Warriors,Dallas Maver";

        String[] listOfTeams = teams.split(",");
        for (String el: listOfTeams) {
            if (el.equals(teamName)) {
                return true;
            }
        }
        return false;
    }

    private  String[] teamStatistic(List<String> teamGames, String toFind) {
        int win = 0;
        int loss = 0;
        int draw = 0;
        int scored = 0;
        int conceded = 0;

        for (String el: teamGames) {
            String[] scores = el
                    .replaceAll("[^\\d.]", " ")
                    .trim()
                    .replaceAll(" +", " ")
                    .split(" ");
            for (String score: scores) {
                if (score.contains(".")) {
                    return new String[] {"Error(", score, "):" ,el};
                }
            }

            if (el.indexOf(toFind) < el.indexOf(scores[0])) {
                scored += Integer.parseInt(scores[0]);
                conceded += Integer.parseInt(scores[1]);
                if (Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])) {
                    win ++;
                } else if (Integer.parseInt(scores[0]) < Integer.parseInt(scores[1])) {
                    loss ++;
                } else {
                    draw ++;
                }
            } else {
                scored += Integer.parseInt(scores[1]);
                conceded += Integer.parseInt(scores[0]);
                if (Integer.parseInt(scores[1]) > Integer.parseInt(scores[0])) {
                    win ++;
                } else if (Integer.parseInt(scores[1]) < Integer.parseInt(scores[0])) {
                    loss ++;
                } else {
                    draw ++;
                }
            }
        }
        int points = (win * 3) + draw;

        return new String[] {String.valueOf(win),
                String.valueOf(draw), String.valueOf(loss),
                String.valueOf(scored), String.valueOf(conceded), String.valueOf(points)};
    }
}
