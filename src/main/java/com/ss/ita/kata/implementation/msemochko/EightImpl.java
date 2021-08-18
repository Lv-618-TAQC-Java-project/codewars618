package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        double result = time / 2;
        if (time > 0) {
            return (int) result;
        } else {
            return -1;
        }
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0) {
            return length * width * height;
        } else {
            return -1;
        }
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float KM = 1.609344f;
        final float LT = 4.54609188f;

        if (mpg > 0) {
            return BigDecimal.valueOf(mpg * KM / LT).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        } else {
            return -1;
        }
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        if (array.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] tempArray = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                tempArray[0] += 1;
            } else {
                tempArray[1] += input[i];
            }
        }
        return tempArray;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return  (n == 5 || n == 13 || n== 563);
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        if (divider == 0) {
            return null;
        }
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                j++;
            }
        }

        int[] tempArr = new int[j];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                tempArr[counter] = numbers[i];
                counter++;
            }
        }
        return tempArr;
    }
}
