package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
