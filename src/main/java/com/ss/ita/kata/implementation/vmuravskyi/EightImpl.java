package com.ss.ita.kata.implementation.vmuravskyi;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        if (time < 0) throw new IllegalArgumentException();
        return (int) (time * 0.5);
    }


    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float temp = Math.round(((float) (mpg * 1.609344 / 4.54609188) * 100));
        return temp / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j * j <= array[i]; j++) {
                if ((j * j) == array[i]) {
                    result[i] = j;
                } else result[i] = array[i] * array[i];
            }
        }
        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int countPositive = 0;
        int sumOfNegative = 0;
        int[] result = new int[2];
        for (int j : input) {
            if (j > 0) {
                countPositive++;
            } else sumOfNegative += j;
        }
        result[0] = countPositive;
        result[1] = sumOfNegative;
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return (factorial(n-1) + 1) % (n*n) == 0;
    }
    public static double factorial(double number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
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
