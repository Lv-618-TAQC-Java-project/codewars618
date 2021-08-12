package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Eight;

import java.util.Arrays;
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
        return Integer.parseInt(str);
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
        BigDecimal result = new BigDecimal(number);
        result = result.setScale(2, RoundingMode.HALF_UP);

        return result.doubleValue();
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
