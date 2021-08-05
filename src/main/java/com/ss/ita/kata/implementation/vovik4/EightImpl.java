package com.ss.ita.kata.implementation.vovik4;

import com.ss.ita.kata.Eight;

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
        if(n == 1){
            return false;
        }
        else if (((factorial((n - 1)+1)/(n*n))%n) == 0){
            return true;
        }else {
            return false;
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

    private static double factorial(double fact){
        if (fact != 0){
            int result = 1;
            for (int i = 0; i < fact; i++) {
                result *= fact;
            }
            return result;
        }else {
            return 1;
        }
    }
}
