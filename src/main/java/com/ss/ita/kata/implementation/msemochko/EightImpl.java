package com.ss.ita.kata.implementation.msemochko;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        double result = time / 2;
        if (time>0) {
            return (int) result;
        }else {
            return 0;
        }
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0) {
            return length * width * height;
        } else {
            return 0;
        }
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float KM = 1.609344f;
        final float LT = 4.54609188f;

        if (mpg > 0) {
            return BigDecimal.valueOf(mpg * KM / LT).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        } else {
            return 0;
        }
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
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
