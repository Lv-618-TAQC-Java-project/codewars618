package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Six;

import java.util.ArrayList;
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
        return null;
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
}
