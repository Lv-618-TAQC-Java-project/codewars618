package com.ss.ita.kata.implementation.maxde1;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;


public class EightImpl implements Eight {


    @Override
    public int liters(double time) {
        if (time < 0) {
            return -1;
        }
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) return -1;
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg >= 0) {
            float kpl = (mpg * 1.609344f) / 4.54609188f;
            float rounded = (float) (Math.round(kpl * 100) / 100D);
            return rounded;

        } else {
            return -1;
        }
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        if (array.length == 0)
            return new int[0];
        for (int i : array) {
            if (i <= 0)
                return new int[0];
        }
        int[] arr = new int[array.length];
        double root;
        for (int i = 0; i < array.length; i++) {
            root = sqrt(array[i]);
            if (root == ceil(root)) {
                arr[i] = (int) root;
            } else {
                arr[i] = array[i] * array[i];
            }

        }

        return arr;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int positiveElementCount = 0;
        int negativeElementSum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positiveElementCount += 1;
            }
            if (input[i] < 0) {
                negativeElementSum += input[i];
            }
        }

        return new int[]{positiveElementCount, negativeElementSum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        int m = (int) n;
        return m == 5 || m == 13 || m == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100D) / 100D;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> divisibleNumbers = new ArrayList<Integer>();
        for (int i : numbers) {
            if (i % divider == 0) {
                divisibleNumbers.add(i);
            }
        }
        int[] result = new int[divisibleNumbers.size()];
        for (int i = 0; i < divisibleNumbers.size(); i++) {
            result[i] = divisibleNumbers.get(i);
        }
        return result;
    }
}
