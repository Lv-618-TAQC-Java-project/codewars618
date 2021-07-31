package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        return 0;
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
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
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
            result.append(" - (").append(i).append(" : ").append(sum).append(")");
        }
        return result.toString();
    }
}
