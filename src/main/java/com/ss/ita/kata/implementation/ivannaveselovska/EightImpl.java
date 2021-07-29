package com.ss.ita.kata.implementation.ivannaveselovska;

import com.ss.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

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
        return Arrays.stream(array)
                .map( x -> {
                    int sqr = isSquare(x);
                    if(sqr == -1)
                        return x*x;
                    return sqr;
                })
                .toArray();
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0)
            return new int[0];
        int[] result = new int[2];
        Arrays.stream(input)
                .forEach( x -> {
                    if (x > 0)
                        result[0]++;
                    if(x < 0)
                        result[1] += x;
        });
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        if (str.charAt(0) == 45)
            return -1 * numberSighIgnore(str, 1);
        return numberSighIgnore(str, 0);
    }

    @Override
    public boolean amIWilson(double n) {
        double numerator = factorial(n - 1) + 1;
        double denominator = n * n;
        if (numerator % denominator == 0)
            return true;
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    private int isSquare(int number){
        for( int i = 1; i <= number / 2; i ++)
            if ( number / i == i)
                return i;
        return -1;
    }

    private int numberSighIgnore(String str, int start){
        int result = 0;
        int degree = str.length() - 1;
        for (int i = start; i < str.length(); i++){
            int number = str.charAt(i) - 48;
            result += number * Math.pow(10,degree - i);
        }
        return result;
    }

    private double factorial(double number){
        double result = 1;
        while(number > 0){
            result += number--;
        }
        return result;
    }
}
