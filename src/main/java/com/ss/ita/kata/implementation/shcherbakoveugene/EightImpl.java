package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] resultArr = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (Math.sqrt(array[i]) % 1 == 0) {
                    resultArr[i] = (int) Math.sqrt(array[i]);
                } else {
                    resultArr[i] = (int) Math.pow(array[i], 2);
                }
            } else {
                resultArr[i] = 0;
            }
        }
        return resultArr;
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
