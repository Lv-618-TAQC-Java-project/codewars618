package com.ss.ita.kata.implementation.kubrub;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        if (time < 0){
            return -1;
        }
        double litr = Math.floor(time * 0.5);
        return (int) litr;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if(length <= 0 || width <= 0 || height <= 0)
            return -1;
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg < 0){
            return -1;
        }
        float kilometersPerLiter = (mpg * 1.609344f) / 4.54609188f;
        float res = (float)(Math.round(kilometersPerLiter * 100) / 100D);
        return res;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        if(array == null || array.length == 0)
            return new int[0];
        for (int i = 0; i <  array.length; i++){
            if (array[i] <= 0){
                return new int[0];
            }
        }
        int[] arr = new int[array.length];
        for (int i = 0; i <  array.length; i++){
            double n = Math.floor(Math.sqrt(array[i]));

            if (n*n==array[i]){
                arr[i] = (int)n;
            }
            else{
                arr[i] = array[i]*array[i];
            }
        }

        return arr;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0)
            return new int[0];
        int[] myResult = new int[2];
        int i = 0,j = 0;
        for (int x = 0; x <  input.length; x++){
            if (input[x] >= 0) {
                i += 1;
            }
            else{
                j += input[x];
            }
        }
        myResult[0] = i;
        myResult[1] = j;
        return myResult;

    }

    @Override
    public int stringToNumber(String str) {
        int i = Integer.parseInt(str);
        return i;
    }

    @Override
    public boolean amIWilson(double n) {
        double p = n;
        double j,fact = 1.0;
        for(j=1; j <= n-1; j++){
            fact = fact*j;
        }
        double res = 0.0;
        if ((fact+1) % (p * p) == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number*100D)/100D;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        int m = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                m++;
            }
        }
        int[] res = new int[m];
        m = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                res[m] = numbers[i];
                m++;
            }
        }
        return res;
    }
}