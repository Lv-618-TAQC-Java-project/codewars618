package com.ss.ita.kata.implementation.shcherbakoveugene;

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
        if ( n% 1 == 0) {
            if (isPrime(n)) {
                double wilsonFormula = (factorial(n - 1) + 1)/(n * n);
                return wilsonFormula % 1 == 0;
            }
        }

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

    public boolean isPrime(double n) {
        if (n <= 0 || n ==1) {
            return false;
        }
        for (double x = 2; x <= Math.sqrt(n); x++) {
            if ((n % x) == 0) {
                return false;
            }
        }

        return true;
    }

    public int factorial(double n){
        int result = 1;
        for (int i = 1; i <= n; i ++){
            result = result*i;
        }

        return result;
    }
}
