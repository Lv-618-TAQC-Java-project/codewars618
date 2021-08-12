package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return time < 0 ? 0 : (int)(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            return 0;
        }
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg <= 0) {
            return 0;
        }
        float resInKPM = mpg/2.356F;
        BigDecimal result = new BigDecimal(resInKPM);
        result = result.setScale(2, RoundingMode.DOWN);

        return result.floatValue();
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null) {
            return new int[0];
        }
        int count = 0;
        int sum = 0;

        for (int el: input) {
            if (el > 0) {
                count ++;
            } else {
                sum += el;
            }
        }

        return new int[] {count, sum};
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
