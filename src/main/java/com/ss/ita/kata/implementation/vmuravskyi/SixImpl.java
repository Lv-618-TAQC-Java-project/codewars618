package com.ss.ita.kata.implementation.vmuravskyi;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        if (m <= 0) {
            return -1;
        }
        long count = 0;
        long sumOfVolume = 0L;
        for (int i = 1; sumOfVolume < m; i++) {
            sumOfVolume += (long) i * i * i;
            count++;
        }
        if (sumOfVolume == m) {
            return count;
        } else return -1;
    }

    @Override
    public String balance(String book) {
        String[] bookArray = book.split("\n");

        for (int i = 0; i < bookArray.length; i++) {
            bookArray[i] = bookArray[i].replace("\"", "");
        }

        double totalBalance = Double.parseDouble(bookArray[0]);
        bookArray[0] = "Original Balance: ".concat(bookArray[0]);

        double totalExpense = 0.00;
        double[] spending = new double[bookArray.length];
        for (int i = 1; i < bookArray.length; i++) {
            String[] temp = bookArray[i].split(" ");
            spending[i] = Double.parseDouble(temp[temp.length - 1]);
            totalExpense += spending[i];
        }

        totalExpense = Double.parseDouble(String.format("%3.2f", totalExpense));
        double averageExpense = Double.parseDouble(String.format("%3.2f", totalExpense / (bookArray.length - 1)));

        String result = "".concat(bookArray[0] + "\n");
        String add = "Balance ";
        double restBalance;

        for (int i = 1; i < bookArray.length; i++) {
            restBalance = Math.round((totalBalance - spending[i]) * 100);
            restBalance /= 100;
            totalBalance = totalBalance - spending[i];
            result = result.concat(bookArray[i] + " " + add + restBalance + "\n");
        }

        String totalExp = "Total expense: " + totalExpense;
        String averExp = "\nAverage expense: " + averageExpense;
        return result.concat(totalExp).concat(averExp);
    }


    @Override
    public double f(double x) {
        if (x < 0) {
            return -1;
        } else return x / (1.0 + Math.sqrt(1.0 + x));
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || town.isEmpty()) {
            return -1;
        }

        String[] split = strng.split("\n");

        String[] cities = new String[split.length];
        String[] temp;
        int cityIndex = 0;
        for (int i = 0; i < split.length; i++) {
            temp = split[i].split(":");
            cities[i] = temp[0];
            if (town.equals(cities[i])) {
                cityIndex = i;
            }
        }

        String[] rainfall = split[cityIndex].split("[^\\d{1,3}.\\d{1}]");
        double suma = 0;
        String ammount = "";
        int count = 0;
        for (String s : rainfall) {
            ammount = s.replace(",", "");
            if (ammount.isEmpty()) {
                continue;
            } else suma += Double.parseDouble(ammount);
            count++;
        }
        return suma / count;
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || town.isEmpty()) {
            return -1;
        }
        String[] split = strng.split("\n");
        String[] cities = new String[split.length];
        String[] temp;
        int cityIndex = 0;
        for (int i = 0; i < split.length; i++) {
            temp = split[i].split(":");
            cities[i] = temp[0];
            if (town.equals(cities[i])) {
                cityIndex = i;
            }
        }

        String[] rainfall = split[cityIndex].split("[^\\d{1,3}.\\d{1}]");
        double suma = 0;
        String ammount = "";
        int count = 0;
        for (String s : rainfall) {
            ammount = s.replace(",", "");
            if (ammount.isEmpty()) {
                continue;
            } else suma += Double.parseDouble(ammount);
            count++;
        }

        double avarage = suma / count;
        double[] difference = new double[count];
        double variance = 0;
        int j = 0;
        for (String s : rainfall) {
            ammount = s.replace(",", "");
            if (ammount.isEmpty()) {
                continue;
            } else difference[j++] = (Double.parseDouble(ammount) - avarage) * (Double.parseDouble(ammount) - avarage);
        }
        for (double v : difference) {
            variance += v;
        }
        return variance / count;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind == null || toFind.equals("")) {
            return ":This team didn't play!";
        }
        String split = resultSheet.replaceAll("([0-9.]) ", "$1-");
        split = split.replaceAll(" ([0-9.]*)(-)", "_$1$2");
        String s2 = split.replaceAll(" ([0-9.]*)(,)", "_$1$2");
        split = s2.replaceAll(" ([0-9.]*)$", "_$1");
        String[] p = split.split(",");
        int wins = 0;
        int draws = 0;
        int lost = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        boolean flag = false;
        if (toFind.equals("")) {
            return "";
        }
        for (String s : p) {
            String[] match = s.split("-");
            String[] left = match[0].split("_");
            String teamLeft = left[0];
            int pointsLeft = 0;
            try {
                pointsLeft = Integer.parseInt(left[1]);
            } catch (NumberFormatException e) {
                return "Error(float number):" + s.replaceAll("-", " ").replaceAll("_", " ");
            }
            String[] right = match[1].split("_");
            String teamRight = right[0];
            int pointsRight = 0;
            try {
                pointsRight = Integer.parseInt(right[1]);
            } catch (NumberFormatException e) {
                return "Error(float number):" + s.replaceAll("-", " ").replaceAll("_", " ");
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
        if (lstOfArt == null || lstOfArt.length == 0) {
            return "";
        }
        if (lstOf1stLetter == null || lstOf1stLetter.length == 0) {
            return "";
        }

        String[] arrayStr = new String[lstOf1stLetter.length];
        int[] arrayInt = new int[lstOf1stLetter.length];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int count = 0;
            result = new StringBuilder(lstOf1stLetter[i]);
            for (String value : lstOfArt) {
                if (value.startsWith(result.toString())) {
                    count += Integer.parseInt(value.substring(value.indexOf(" ") + 1, value.length()));
                }
            }
            arrayStr[i] = result.toString();
            arrayInt[i] = count;
        }

        result = new StringBuilder("(" + arrayStr[0] + " : " + arrayInt[0] + ")");
        for (int i = 1; i < arrayStr.length; i++)
            result.append(" - (").append(arrayStr[i]).append(" : ").append(arrayInt[i]).append(")");
        return result.toString();
    }
}
