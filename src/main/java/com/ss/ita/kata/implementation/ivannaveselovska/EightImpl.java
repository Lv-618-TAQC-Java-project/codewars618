package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        if (time < 0)
            return -1;
        return (int) time / 2;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if(length <= 0 || width <= 0 || height <=0)
            return -1;
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return BigDecimal.valueOf(mpg * 1.609344 / 4.54609188).setScale(2, RoundingMode.HALF_UP).floatValue();
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
