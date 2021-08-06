package com.ss.ita.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleScanner implements Scanner{

    private java.util.Scanner sc;

    public ConsoleScanner() {
        this.sc = new java.util.Scanner(System.in);
    }

    @Override
    public int readInt() {
        return 0;
    }

    @Override
    public long readLong() {
        return 0;
    }

    @Override
    public float readFloat() {
        return 0;
    }

    @Override
    public double readDouble() {
        return 0;
    }

    @Override
    public String readString() {
        return null;
    }

    @Override
    public BigInteger readBigInteger() {
        return null;
    }

    @Override
    public BigDecimal readBigDecimal() {
        return null;
    }

    @Override
    public double[] readDoubleArray() {
        int size = 0;
        String input = sc.nextLine();
        List<String> resultList = new ArrayList<>(Arrays.asList(input.split(" ")));
        double[] result = new double[resultList.size()];

        while (size != resultList.size()) {
            if (new java.util.Scanner(resultList.get(size)).hasNextDouble()) {
                result[size] = Double.parseDouble(resultList.get(size));
                size++;
            } else {
                System.out.println("Value " + resultList.get(size) + " is not Integer, please try again.");
                resultList.set(size, sc.next());
            }
        }

        return result;
    }

    @Override
    public int[] readIntArray() {
        int size = 0;
        String input = sc.nextLine();
        List<String> resultList = new ArrayList<>(Arrays.asList(input.split(" ")));
        int[] result = new int[resultList.size()];

        while (size != resultList.size()) {
            if (new java.util.Scanner(resultList.get(size)).hasNextInt()) {
                result[size] = Integer.parseInt(resultList.get(size));
                size++;
            } else {
                System.out.println("Value " + resultList.get(size) + " is not Integer, please try again.");
                resultList.set(size, sc.next());
            }
        }

        return result;
    }
}
