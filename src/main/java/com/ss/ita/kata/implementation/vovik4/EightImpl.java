package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Eight;

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
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kmPerL = mpg * (1.609344f/ 4.54609188f);
        return (float)(Math.round(kmPerL*100)/100D);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
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
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
