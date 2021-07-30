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
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
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
