package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
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
        return null;
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
