package com.ss.ita.kata.implementation.kubrub;

import java.util.ArrayList;
import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        double litr = Math.floor(time * 0.5);
        return (int) litr;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i <  array.length; i++){
            double n = Math.floor(Math.sqrt(array[i]));

            if (n*n==array[i]){
                array[i] = (int)n;
            }
            else{
                array[i] *= array[i];
            }
        }

        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] myResult = new int[2];
        int i = 0,j = 0;
        for (int x = 0; x <  input.length; x++){
            if (input[x] >= 0) {
                i += 1;
            }
            else{
                j += input[x];
            }
        }
        myResult[0] = i;
        myResult[0] = j;
        return myResult;

    }

    @Override
    public int stringToNumber(String str) {
        int i = Integer.parseInt(str);
        return i;
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
