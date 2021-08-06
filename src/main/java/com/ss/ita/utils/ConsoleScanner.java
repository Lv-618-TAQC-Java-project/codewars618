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
        while(true){
            if(sc.hasNextInt()){
                return new Integer(sc.nextLine());
            }
            else {
                System.out.println("ERROR");
                sc.next();
            }
        }
    }

    @Override
    public long readLong() {
        while(true){
            if(sc.hasNextLong()){
                return new Long(sc.nextLine());
            }
            else {
                System.out.println("ERROR");
                sc.next();
            }
        }
    }

    @Override
    public float readFloat() {
        while(true){
            if(sc.hasNextFloat()){
                return new Float(sc.nextLine());
            }
            else {
                System.out.println("ERROR");
                sc.next();
            }
        }
    }

    @Override
    public double readDouble() {
        while(true){
            if(sc.hasNextDouble()){
                return new Double(sc.nextLine());
            }
            else {
                System.out.println("ERROR");
                sc.next();
            }
        }
    }

    @Override
    public String readString() {
        while(true){
            if(sc.hasNext()){
                return new String(sc.nextLine());
            }
            else {
                System.out.println("ERROR");
                sc.next();
            }
        }
    }

    @Override
    public BigInteger readBigInteger() {
        while(true){
            if(sc.hasNextBigInteger()){
                return new BigInteger(sc.nextLine());
            }
            else {
                System.out.println("ERROR");
                sc.next();
            }
        }
    }

    @Override
    public BigDecimal readBigDecimal() {
        while(true){
            if(sc.hasNextBigDecimal()){
                return new BigDecimal(sc.nextLine());
            }
            else {
                System.out.println("ERROR");
                sc.next();
            }
        }

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
