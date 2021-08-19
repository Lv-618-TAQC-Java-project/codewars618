package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        if (time<0){
            return -1;
        }
        return (int)(time*0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if(length <= 0 || width <= 0 || height <= 0){
            return -1;
        }
        return length*width*height;

    }

    @Override
    public float mpgToKPM(float mpg) {
        if(mpg <= 0 ){
            return 0;
        }
        float kmPerL = mpg * (1.609344f/ 4.54609188f);
        return (float)(Math.round(kmPerL*100)/100D);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        if (array.length == 0)
            return new int[0];
        for (int i : array) {
            if (i <= 0)
                return new int[0];
        }
        int[] outPut = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (((double)(Math.sqrt(array[i]) % 1) == 0)) {
                outPut[i] = (int)Math.sqrt(array[i]);
            }else {
                outPut[i] = (int)Math.pow(array[i],2);
            }
        }
        return outPut;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if(input != null){
            int count = 0;
            int negSum = 0;
            for (int i = 0; i < input.length; i++) {
                if(input[i] > 0){
                    count++;
                }else {
                    negSum += input[i];
                }
            }
            return new int[]{count,negSum};
        }else{
            return new int[]{};
        }

    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if(n == 1){
            return false;
        }
        else if ((factorial(n - 1)+1)%n*n == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number*100D)/100D;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % divider == 0){
                list.add(numbers[i]);
            }
        }
        int [] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static double factorial(double fact){
        if (fact <= 1) {
            return 1;
        } else {
            return fact * factorial(fact - 1);

        }
    }
}
