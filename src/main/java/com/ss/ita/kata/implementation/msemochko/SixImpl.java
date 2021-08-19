package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        if (m<=0){
            return -1L;
        }
        long numOfCubes = 0;
        long sum = 0;
        while (sum < m){
            numOfCubes++;
            sum += Math.pow(numOfCubes,3);
        }
        return sum == m ? numOfCubes : -1;
    }

    @Override
    public String balance(String book) {
        String newBook;
        newBook = book.replaceAll("[^a-zA-Z0-9.\n ]","");
        String[] line = newBook.split("[\\n]");
        double balance = Double.parseDouble(line[0]);
        double totalExpense = 0;
        double spending = 0;
        int numberOfPurchase;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance is " + line[0]);
        for (int i = 1; i < line.length; i++) {
            spending++;
            String[] splitLine = line[i].split("[ ]+");
            balance -= Double.parseDouble(splitLine[2]);
            totalExpense += Double.parseDouble(splitLine[2]);
            String modLine = String.format("\n%s %s %s Balance %.2f", splitLine[0], splitLine[1], splitLine[2], balance);
            result.append(modLine);
        }
        result.append(String.format("\nTotal expense is %.2f\nAverage expense is %.2f", totalExpense, totalExpense/spending ));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
    }

    @Override
    public double mean(String town, String strng) {
        if (town.isEmpty() || strng.isEmpty()) {
            return -1;
        }
        String[] lines = strng.split("[\\n]");
        int counter = 0;
        double sumOfRain = 0;
        for (String city : lines) {
            String[] data = city.split(",");
            if (data[0].equals(town)) {
                String[] months = data[1].split(",");
                for (String month : months) {
                    String[] values = month.split(" ");
                    sumOfRain += Double.parseDouble(values[1]);
                    counter++;
                }
            }

        }
        return (sumOfRain == 0) ? -1 : (sumOfRain / (double) counter);
    }

    @Override
    public double variance(String town, String strng) {
        if (town.isEmpty() || strng.isEmpty()) {
            return -1;
        }
        double average = mean(town, strng);
        double variance = 0.0;
        String[] cities = strng.split("\\n");
        double sum = 0.0;
        int counter = 0;
        for (String city : cities) {
            String[] data = city.split(":");
            if (data[0].equals(town)) {
                String[] months = data[1].split(",");
                for (String month : months) {
                    String[] values = month.split(" ");
                    variance += Math.pow((average - Double.parseDouble(values[1])), 2);
                    counter++;
                }
            }
        }
        return (variance == 0) ? -1 : (variance / (double) counter);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (resultSheet == "") {
            return "";
        }
        String s1 = resultSheet.replaceAll("([0-9.]) ", "$1-");
        s1 = s1.replaceAll(" ([0-9.]*)(-)", "_$1$2");
        String s2 = s1.replaceAll(" ([0-9.]*)(,)", "_$1$2");
        s1 = s2.replaceAll(" ([0-9.]*)$", "_$1");
        String[] p = s1.split(",");
        int wins = 0;
        int draws = 0;
        int lost = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        boolean flag = false;
        if (toFind.equals("")) {
            return ":This team didn't play!";
        }
        for (int i = 0; i < p.length; i++) {
            String[] match = p[i].split("-");
            String[] left = match[0].split("_");
            String teamLeft = left[0];
            int pointsLeft = 0;
            try {
                pointsLeft = Integer.parseInt(left[1]);
            } catch (NumberFormatException e) {
                return "Error(float number):" + p[i].replaceAll("-", " ").replaceAll("_", " ");
            }
            String[] right = match[1].split("_");
            String teamRight = right[0];
            int pointsRight = 0;
            try {
                pointsRight = Integer.parseInt(right[1]);
            } catch (NumberFormatException e) {
                return "Error(float number):" + p[i].replaceAll("-", " ").replaceAll("_", " ");
            }
            if (teamLeft.equalsIgnoreCase(toFind)) {
                flag = true;
                if (pointsLeft > pointsRight) {
                    wins++;
                    points += 3;
                    scored += pointsLeft;
                    conceded += pointsRight;
                } else if (pointsLeft == pointsRight) {
                    draws++;
                    scored += pointsLeft;
                    conceded += pointsRight;
                    points++;
                } else {
                    lost++;
                    scored += pointsLeft;
                    conceded += pointsRight;
                }
            }
            if (teamRight.equalsIgnoreCase(toFind)) {
                flag = true;
                if (pointsLeft < pointsRight) {
                    wins++;
                    scored += pointsRight;
                    conceded += pointsLeft;
                    points += 3;
                } else if (pointsLeft == pointsRight) {
                    draws++;
                    scored += pointsRight;
                    conceded += pointsLeft;
                    points++;
                } else {
                    lost++;
                    scored += pointsRight;
                    conceded += pointsLeft;
                }
            }

        }
        if (!flag) {
            return toFind + ":This team didn't play!";
        }
        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + lost + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }


    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0){
            return "";
        }

        int sum;
        StringBuilder result = new StringBuilder();

        for (String i : lstOf1stLetter) {
            sum = 0;
            for (String j : lstOfArt) {
                if (j.substring(0, 1).equals(i)) {
                    sum += Integer.parseInt((j.replaceAll("[^0-9]", "")));
                }
            }
            result.append("(").append(i).append(" : ").append(sum).append(")");
            if (i == "A"){
                result.append(" - ");
            }
        }
        return result.toString();
    }
}
